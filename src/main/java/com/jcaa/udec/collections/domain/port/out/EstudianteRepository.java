package com.jcaa.udec.collections.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.jcaa.udec.collections.domain.core.model.Estudiante;

public interface EstudianteRepository {

    void save(Estudiante estudiante);

    Optional<Estudiante> findById(String id);

    Optional<Estudiante> findByEmail(String email);

    List<Estudiante> findAll();

    void delete(String id);
}
