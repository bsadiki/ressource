package com.sadiki.badreddine.ressource.dao;

import com.sadiki.badreddine.ressource.entities.Ressource;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface RessourceRepository extends JpaRepository<Ressource, Long>{
    public Page<Ressource> findBySocieteId(Long societeId, Pageable pageable);
    public Page<Ressource> findByNomContains(String nom, Pageable pageable);
}
