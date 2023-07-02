
package com.tienda.iquantum.controladores;

import com.tienda.iquantum.entidades.Sonido;
import com.tienda.iquantum.servicios.SonidoService;
import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/sonido")
@CrossOrigin(origins = { "https://iquantum3-e1f79.web.app/", "http://localhost:4200"})
public class SonidoController {
    
    @Autowired
    private SonidoService sonidoService;
    
      @PostMapping("/")
    public ResponseEntity<Sonido> guardarSonido(@RequestBody Sonido sonido) {
        Sonido sonidoGuardado = sonidoService.agregarSonido(sonido);
        return ResponseEntity.ok(sonidoGuardado);
    }
    
    @GetMapping("/{sonidoId}")
    public Sonido listarSonidoPorId(@PathVariable("sonidoId") Long sonidoId) {
        return sonidoService.obtenerSonido(sonidoId);
    }
    
      @GetMapping("/")
    public ResponseEntity<?> listarSonidos() {
        return ResponseEntity.ok(sonidoService.obtenerSonidos());
    }
    
     @PutMapping("/")
    public Sonido actualizarSonido(@RequestBody Sonido sonido) {
        return sonidoService.actualizarSonido(sonido);
    }
    
    @DeleteMapping("/{sonidoId}")
    public void eliminarSonido(@PathVariable("sonidoId") Long sonidoId) {
        sonidoService.eliminarSonido(sonidoId);
    }
}
