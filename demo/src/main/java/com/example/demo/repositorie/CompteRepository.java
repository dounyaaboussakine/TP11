package com.example.demo.repositorie;

import com.example.demo.entities.Compte;
import com.example.demo.entities.TypeCompte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.query.Param;

import java.util.List;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {

    // Expose un endpoint REST pour filtrer par type
    List<Compte> findByType(@Param("type") TypeCompte type);
}
