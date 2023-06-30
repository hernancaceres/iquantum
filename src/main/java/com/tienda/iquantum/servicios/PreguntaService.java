
package com.tienda.iquantum.servicios;

import com.tienda.iquantum.entidades.Examen;
import com.tienda.iquantum.entidades.Pregunta;
import java.util.Set;


public interface PreguntaService {
     Pregunta agregarPregunta(Pregunta pregunta);

    Pregunta actualizarPregunta(Pregunta pregunta);

    Set<Pregunta> obtenerPreguntas();

    Pregunta obtenerPregunta(Long preguntaId);

    Set<Pregunta> obtenerPreguntasDelExamen(Examen examen);

    void eliminarPregunta(Long preguntaId);

    Pregunta listarPregunta(Long preguntaId);
}
