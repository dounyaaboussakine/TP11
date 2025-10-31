package com.example.demo.projections;

import com.example.demo.entities.Compte;
import com.example.demo.entities.TypeCompte;
import org.springframework.data.rest.core.config.Projection;

@Projection(name = "mobile", types = Compte.class)
public interface CompteProjection2 {
    double getSolde();
    TypeCompte getType();
}
