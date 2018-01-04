package com.sadiki.badreddine.ressource.service;
import com.sadiki.badreddine.ressource.dao.EntrepriseRepository;
import com.sadiki.badreddine.ressource.entities.Entreprise;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "EntrepriseRestController")
@CrossOrigin("*")
public class EntrepriseRestController {
    @Autowired
    EntrepriseRepository entrepriseRepository;
    @GetMapping(value = "/entreprise")
    @ApiOperation(value = "Chercher toutes les entreprise")
    public List<Entreprise> getEnreprises(){
        return entrepriseRepository.findAll();
    }
    @GetMapping(value = "/entrepriseByName")
    @ApiOperation(value = "Chercher les entreprise par nom")
    public Page<Entreprise> getEnreprisesByName(@RequestParam(defaultValue = "") String nom,
                                                 @RequestParam(defaultValue = "0") int page,
                                                 @RequestParam(defaultValue = "5") int size){
        return entrepriseRepository.findByEntrepriseNomContains(nom,new PageRequest(page,size));
    }
    @PostMapping(value = "/entreprise")
    @ApiOperation(value = "Ajouter une entreprise")
    public Entreprise addEntreprise(@RequestBody Entreprise entreprise){
        return entrepriseRepository.save(entreprise);
    }
}