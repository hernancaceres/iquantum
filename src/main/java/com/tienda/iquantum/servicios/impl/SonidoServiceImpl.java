package com.tienda.iquantum.servicios.impl;

import com.tienda.iquantum.entidades.Sonido;
import com.tienda.iquantum.repositorios.SonidoRepository;
import com.tienda.iquantum.servicios.SonidoService;
import java.util.LinkedHashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SonidoServiceImpl implements SonidoService {

    @Autowired
    private SonidoRepository sonidoRepository;

    @Override
    public Sonido agregarSonido(Sonido sonido) {
        return sonidoRepository.save(sonido);
    }

    @Override
    public Sonido actualizarSonido(Sonido sonido) {
        return sonidoRepository.save(sonido);
    }

    @Override
    public Set<Sonido> obtenerSonidos() {
        return new LinkedHashSet<>(sonidoRepository.findAll());
    }

    @Override
    public Sonido obtenerSonido(Long sonidoId) {
        return sonidoRepository.findById(sonidoId).get();
    }

    @Override
    public void eliminarSonido(Long sonidoId) {
        Sonido sonido = new Sonido();
        sonido.setSonidoId(sonidoId);
        sonidoRepository.delete(sonido);
    }

}
