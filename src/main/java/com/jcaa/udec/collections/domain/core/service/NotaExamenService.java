package com.jcaa.udec.collections.domain.core.service;

import com.jcaa.udec.collections.domain.core.model.Examen;

public class NotaExamenService {
    
    public double calcularNotaFinal(Examen examen , double notaComponente1, double notaComponente2, boolean esPractico) {
        if(esPractico){
            return (notaComponente1 * 0.70) + (notaComponente2 * 0.30);
        } else {
            return (notaComponente1 * 0.80) + (notaComponente2 * 0.20);
        }
    }
}
