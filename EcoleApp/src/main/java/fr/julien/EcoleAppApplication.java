package fr.julien;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.julien.entities.Classe;
import fr.julien.entities.Role;
import fr.julien.entities.User;
import fr.julien.repository.ClassesRepository;
import fr.julien.repository.RoleRepository;
import fr.julien.repository.UserRepository;

@SpringBootApplication
public class EcoleAppApplication implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepos;
	
	@Autowired
	private RoleRepository roleRepos;
	
	@Autowired
	private ClassesRepository classeRepo;

	public static void main(String[] args) {
		SpringApplication.run(EcoleAppApplication.class, args);
		System.out.println("lancement terminé");
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("lancement ..........");
		
		Role r1 = new Role(null, "eleve");
		Role r2 = new Role(null, "admin");
		Role r3 = new Role(null, "enseignant");
		
		roleRepos.save(r1);
		roleRepos.save(r2);
		roleRepos.save(r3);
		
		User u1 = new User(null, "Tig TIUOL", "azerty", "qwerty", null);
		User u2 = new User(null, "Eleve TIUOL", "eleve", "ecole", r1);
		User u3 = new User(null, "Prof TIUOL", "prof", "enseignant", r3);
		User u4 = new User(null, "Directeur TIUOL", "directeur", "admin", r2);
		
		userRepos.save(u1);
		userRepos.save(u2);
		userRepos.save(u3);
		userRepos.save(u4);
		
		
		Classe c1 = new Classe(null, "Terminal", u3);
		Classe c2 = new Classe(null, "Second", u3);
		
		classeRepo.save(c1);
		classeRepo.save(c2);
	}

}
