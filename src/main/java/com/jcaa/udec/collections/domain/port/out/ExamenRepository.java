package com.jcaa.udec.collections.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.jcaa.udec.collections.domain.core.model.Examen;

public interface ExamenRepository {
    void save(Examen examen);
    Optional<Examen> findById(String id);
    List<Examen> findAll();
    List<Examen> findBySubjectCode(String subjectCode);
    void delete(String id);
}
