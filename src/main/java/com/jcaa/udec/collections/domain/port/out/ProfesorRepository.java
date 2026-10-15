package com.jcaa.udec.collections.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.jcaa.udec.collections.domain.core.model.Profesor;

public interface ProfesorRepository {
    void save(Profesor profesor);
    Optional<Profesor> findByEmail(String email);
    List<Profesor> findAll ();
    void delete(String id);
}
