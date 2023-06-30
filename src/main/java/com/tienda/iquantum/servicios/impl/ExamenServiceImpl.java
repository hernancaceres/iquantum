
package com.tienda.iquantum.servicios.impl;

import com.tienda.iquantum.entidades.Categoria;
import com.tienda.iquantum.entidades.Examen;
import com.tienda.iquantum.repositorios.ExamenRepository;
import com.tienda.iquantum.servicios.ExamenService;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExamenServiceImpl implements ExamenService{
    
     @Autowired
    private ExamenRepository examenRepository;

     @Override
    public Examen agregarExamen(Examen examen) {
        return examenRepository.save(examen);
    }

    @Override
    public Examen actualizarExamen(Examen examen) {
        return examenRepository.save(examen);
    }

   @Override
    public Set<Examen> obtenerExamenes() {
        return new LinkedHashSet<>(examenRepository.findAll());
    }

     @Override
    public Examen obtenerExamen(Long examenId) {
        return examenRepository.findById(examenId).get();
    }

     @Override
    public void eliminarExamen(Long examenId) {
        Examen examen = new Examen();
        examen.setExamenId(examenId);
        examenRepository.delete(examen);
    }

      @Override
    public List<Examen> listarExamenesDeUnaCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Examen> obtenerExamenesActivos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Examen> obtenerExamenesActivosDeUnaCategoria(Categoria categoria) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
