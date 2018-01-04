package com.sadiki.badreddine.ressource;

import com.sadiki.badreddine.ressource.dao.RessourceRepository;
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
	@Test
	public void contextLoads() {
		Ressource ressource = new Ressource("ll",new Date(),20,10,1L);
		Ressource ressource2 = new Ressource("l",new Date(),20,10,1L);
		Ressource ressource3 = new Ressource("l12l",new Date(),20,10,1L);
		Ressource ressource4 = new Ressource("llwewef",new Date(),20,10,1L);
		ressourceRepository.save(ressource);
		ressourceRepository.save(ressource2);
		ressourceRepository.save(ressource3);
		ressourceRepository.save(ressource4);
	}

}
