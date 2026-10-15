package com.jcaa.udec.collections.domain.port.out;

import java.util.List;
import java.util.Optional;
import com.jcaa.udec.collections.domain.core.model.Subject;

public interface SubjectRepository {
    void save(Subject subject);
    Optional<Subject> findByCodigo(String codigo);
    List<Subject> findAll();
    void delete(String codigo);
}
