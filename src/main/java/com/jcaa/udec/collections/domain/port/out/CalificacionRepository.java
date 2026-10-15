package com.jcaa.udec.collections.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.jcaa.udec.collections.domain.core.model.Calificacion;

public interface CalificacionRepository {
    Optional<Calificacion> findById(String id);
    List<Calificacion> findByEstudianteId(String estudianteId);
    List<Calificacion> findBySubjectCode(String subjectCode);
    List<Calificacion> findAll();
    void delete(String id);
    void save(Calificacion calificacion);
}
