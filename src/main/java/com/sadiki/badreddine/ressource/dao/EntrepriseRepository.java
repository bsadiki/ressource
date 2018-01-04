package com.sadiki.badreddine.ressource.dao;


import com.sadiki.badreddine.ressource.entities.Entreprise;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EntrepriseRepository extends JpaRepository<Entreprise, Long> {
    Page<Entreprise> findByEntrepriseNomContains(String entrepriseNom, Pageable pageable);
    List<Entreprise> findByEntrepriseNomContains(String entrepriseNom);

}
