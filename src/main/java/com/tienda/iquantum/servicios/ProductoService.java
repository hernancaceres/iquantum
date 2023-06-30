
package com.tienda.iquantum.servicios;

import com.tienda.iquantum.entidades.Producto;
import com.tienda.iquantum.repositorios.ProductoRepository;
import java.util.List;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductoService {
    
    @Autowired
    ProductoRepository productoRepository;
    
     public List<Producto> list() {
        return productoRepository.findAll();
    }
     
      public Optional<Producto> getOne(Long id) {
        return productoRepository.findById(id);
    }
      
       public Optional<Producto> getByNombreP(String nombreP) {
        return productoRepository.findByNombreP(nombreP);
    }
    
          public void save(Producto producto) {
        productoRepository.save(producto);
    }

    public void delete(Long id) {
        productoRepository.deleteById(id);
    }

    public boolean existsById(Long id) {
        return productoRepository.existsById(id);
    }

    public boolean existsByNombreP(String nombreP) {
        return productoRepository.existsByNombreP(nombreP);
    }
}
