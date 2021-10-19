package fr.julien.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.julien.entities.Classe;
import fr.julien.repository.ClassesRepository;

@RestController @CrossOrigin("*")
public class ClasseRest {
	@Autowired
	private ClassesRepository classeRepo;
	
	@GetMapping("classes")
	public Iterable<Classe> getAllClass() {
		return classeRepo.findAll();
	}

}
