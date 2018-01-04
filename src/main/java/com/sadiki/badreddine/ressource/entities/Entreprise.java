package com.sadiki.badreddine.ressource.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
@Entity
public class Entreprise implements Serializable {
    @Id
    @GeneratedValue
    private Long entrepriseId;
    private String entrepriseNom;
    private String raisonSociale;
    @OneToMany(mappedBy = "entreprise",fetch = FetchType.LAZY)
    private Collection<Ressource> ressources;

    public Entreprise() {
    }

    public Entreprise(String entrepriseNom, String raisonSociale) {

        this.entrepriseNom = entrepriseNom;
        this.raisonSociale = raisonSociale;
    }

    public Long getEntrepriseId() {
        return entrepriseId;
    }

    public void setEntrepriseId(Long entrepriseId) {
        this.entrepriseId = entrepriseId;
    }

    public String getEntrepriseNom() {
        return entrepriseNom;
    }

    public void setEntrepriseNom(String entrepriseNom) {
        this.entrepriseNom = entrepriseNom;
    }

    public String getRaisonSociale() {
        return raisonSociale;
    }

    public void setRaisonSociale(String raisonSociale) {
        this.raisonSociale = raisonSociale;
    }
    @JsonIgnore
    public Collection<Ressource> getRessources() {
        return ressources;
    }

    public void setRessources(Collection<Ressource> ressources) {
        this.ressources = ressources;
    }
}
