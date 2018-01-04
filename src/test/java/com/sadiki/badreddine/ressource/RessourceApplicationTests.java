package com.sadiki.badreddine.ressource;

import com.sadiki.badreddine.ressource.dao.EntrepriseRepository;
import com.sadiki.badreddine.ressource.dao.RessourceRepository;
import com.sadiki.badreddine.ressource.entities.Entreprise;
import com.sadiki.badreddine.ressource.entities.Ressource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RessourceApplicationTests {
	@Autowired
	RessourceRepository ressourceRepository;
    @Autowired
	EntrepriseRepository entrepriseRepository;
	@Test
	public void contextLoads() {
        Entreprise entreprise = new Entreprise("entr","rais");
        Entreprise entreprise1 = new Entreprise("entr1","rais1");
        Entreprise entreprise2 = new Entreprise("entr2","rais32");
        Entreprise entreprise3 = new Entreprise("entr3","rais3");
        entrepriseRepository.save(entreprise);
        entrepriseRepository.save(entreprise2);
        entrepriseRepository.save(entreprise3);
        entrepriseRepository.save(entreprise1);
		Ressource ressource = new Ressource("ll",new Date(),20,10,entreprise);
		Ressource ressource2 = new Ressource("l",new Date(),20,10,entreprise1);
		Ressource ressource3 = new Ressource("l12l",new Date(),20,10,entreprise1);
		Ressource ressource4 = new Ressource("llwewef",new Date(),20,10,entreprise2);
		ressourceRepository.save(ressource);
		ressourceRepository.save(ressource2);
		ressourceRepository.save(ressource3);
		ressourceRepository.save(ressource4);
	}

}
