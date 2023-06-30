
package com.tienda.iquantum.controladores;

import com.tienda.iquantum.Dto.DtoProducto;
import com.tienda.iquantum.configuraciones.Mensaje;
import com.tienda.iquantum.entidades.Producto;
import com.tienda.iquantum.servicios.ProductoService;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/producto")
@CrossOrigin(origins = { "https://frontendap-bdefb.web.app", "http://localhost:4200" }) 
public class ProductoController {
    
    @Autowired
    ProductoService productoService;

    @GetMapping("/lista")
    public ResponseEntity<List<Producto>> list() {
        List<Producto> list = productoService.list();
        return new ResponseEntity(list, HttpStatus.OK);
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Producto> getById(@PathVariable("id") Long id) {
        if (!productoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.BAD_REQUEST);
        }

        Producto producto = productoService.getOne(id).get();
        return new ResponseEntity(producto, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        if (!productoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        productoService.delete(id);
        return new ResponseEntity(new Mensaje("Educacion eliminada"), HttpStatus.OK);
    }

    @PostMapping("/create")
    public ResponseEntity<?> create(@RequestBody DtoProducto dtoProducto) {
        if (StringUtils.isBlank(dtoProducto.getNombreP())) {
            return new ResponseEntity(new Mensaje("El nombre es obligatorio"), HttpStatus.BAD_REQUEST);
        }
        if (productoService.existsByNombreP(dtoProducto.getNombreP())) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }

        Producto producto = new Producto(
                dtoProducto.getNombreP(),dtoProducto.getDescripcionP(),dtoProducto.getPrecioP()
        );
        productoService.save(producto);
        return new ResponseEntity(new Mensaje("Producto creada"), HttpStatus.OK);

    }

    @PutMapping("/update/{id}")
        public ResponseEntity<?> update(@PathVariable("id") Long id, @RequestBody DtoProducto dtoProducto) {
        if (!productoService.existsById(id)) {
            return new ResponseEntity(new Mensaje("No existe el ID"), HttpStatus.NOT_FOUND);
        }
        if (productoService.existsByNombreP(dtoProducto.getNombreP()) && productoService.getByNombreP(dtoProducto.getNombreP()).get().getId() != id) {
            return new ResponseEntity(new Mensaje("Ese nombre ya existe"), HttpStatus.BAD_REQUEST);
        }
        if (StringUtils.isBlank(dtoProducto.getNombreP())) {
            return new ResponseEntity(new Mensaje("El campo no puede estar vacio"), HttpStatus.BAD_REQUEST);
        }

        Producto producto = productoService.getOne(id).get();

        producto.setNombreP(dtoProducto.getNombreP());
        producto.setDescripcionP(dtoProducto.getDescripcionP());
        producto.setPrecioP(dtoProducto.getPrecioP());
       
        

        productoService.save(producto);

        return new ResponseEntity(new Mensaje("Producto actualizado"), HttpStatus.OK);
    }
    
}
