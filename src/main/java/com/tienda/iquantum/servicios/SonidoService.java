
package com.tienda.iquantum.servicios;

import com.tienda.iquantum.entidades.Sonido;
import java.util.Set;


public interface SonidoService {
    
    Sonido agregarSonido(Sonido sonido);

    Sonido actualizarSonido(Sonido sonido);

    Set<Sonido> obtenerSonidos();

    Sonido obtenerSonido(Long sonidoId);

    void eliminarSonido(Long sonidoId);
    
}
