package com.sadiki.badreddine.ressource.dao;

import com.sadiki.badreddine.ressource.entities.Ressource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

public interface RessourceRepository extends JpaRepository<Ressource, Long>{
    Page<Ressource> findByEntreprise_EntrepriseId(Long societeId, Pageable pageable);
    Page<Ressource> findByNomContains(String nom, Pageable pageable);
    List<Ressource> findByEntreprise_EntrepriseId(Long societeId);
    List<Ressource> findByNomContains(String nom);
}
