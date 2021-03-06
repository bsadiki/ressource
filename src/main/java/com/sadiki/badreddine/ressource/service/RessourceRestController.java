package com.sadiki.badreddine.ressource.service;

import com.sadiki.badreddine.ressource.dao.RessourceRepository;
import com.sadiki.badreddine.ressource.entities.Ressource;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Api(tags = "RessourceRestController")
@CrossOrigin("*")
public class RessourceRestController {
    @Autowired
    RessourceRepository ressourceRepository;
    @GetMapping(value = "/ressources")
    @ApiOperation(value = "Chercher toutes les ressource")
    public List<Ressource> getRessources(){
        return ressourceRepository.findAll();
    }
    @PostMapping(value = "/ressource")
    @ApiOperation(value = "Ajouter une ressource")
    public Ressource addRessource(@RequestBody Ressource ressource){
        return ressourceRepository.save(ressource);
    }
    @GetMapping(value = "/ressourcesbyNom")
    @ApiOperation(value = "Chercher les ressource par nom")
    public Page<Ressource> getRessourcesByName(@RequestParam(defaultValue = "") String nom,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "5") int size){
        return ressourceRepository.findByNomContains(nom, new PageRequest(page,size));
    }
    @ApiOperation(value = "Chercher les ressoucces par societe")
    @GetMapping(value = "/ressourcesBySociete")
    public Page<Ressource> getRessourcesBySociete(@RequestParam(defaultValue = "") Long entrepriseId,
                                                @RequestParam(defaultValue = "0") int page,
                                                @RequestParam(defaultValue = "5") int size){
        return ressourceRepository.findByEntreprise_EntrepriseId(entrepriseId, new PageRequest(page,size));
    }
}
