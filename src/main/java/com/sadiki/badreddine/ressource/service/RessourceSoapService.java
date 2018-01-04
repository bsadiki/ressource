package com.sadiki.badreddine.ressource.service;

import com.sadiki.badreddine.ressource.dao.RessourceRepository;
import com.sadiki.badreddine.ressource.entities.Ressource;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "RessourceSoapService")
public class RessourceSoapService {
    @Autowired
    RessourceRepository ressourceRepository;
    @WebMethod(operationName = "getAllRessources")

    public List<Ressource> getRessources(){
        return ressourceRepository.findAll();
    }
    @WebMethod(operationName = "getRessourceByName")
    public List<Ressource> getRessourcesByName(@WebParam String nom){
        return ressourceRepository.findByNomContains(nom);
    }
    @WebMethod(operationName = "getRessourceBySociete")
    public List<Ressource> getRessourcesBySociete(@WebParam Long entrepriseId){
        return ressourceRepository.findByEntreprise_EntrepriseId(entrepriseId);
    }
}
