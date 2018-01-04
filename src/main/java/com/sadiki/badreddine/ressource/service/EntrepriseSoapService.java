package com.sadiki.badreddine.ressource.service;

import com.sadiki.badreddine.ressource.dao.EntrepriseRepository;
import com.sadiki.badreddine.ressource.entities.Entreprise;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import java.util.List;

@WebService(serviceName = "EntrepriseSoapService")
public class EntrepriseSoapService {
    @Autowired
    EntrepriseRepository entrepriseRepository;
    @WebMethod(operationName = "getAllEnreprises")
    public List<Entreprise> getEnreprises(){
        return entrepriseRepository.findAll();
    }
    @WebMethod(operationName = "getEnreprisesByName")
    public List<Entreprise> getEnreprisesByName(@WebParam String nom){
        return entrepriseRepository.findByEntrepriseNomContains(nom);
    }
}
