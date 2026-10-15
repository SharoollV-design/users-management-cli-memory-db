package com.jcaa.udec.collections.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.jcaa.udec.collections.domain.core.model.Inscripcion;

public interface  InscripcionRepository {
    void save(Inscripcion inscripcion);
    Optional<Inscripcion> findById(String id);
    List<Inscripcion> findByEstudianteId(String estudianteId);
    List<Inscripcion> findBySubjectCode(String subjectCode);
    List<Inscripcion> findAll();
    void delete(String id);
}
