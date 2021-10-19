package fr.julien.repository;

import org.springframework.data.repository.CrudRepository;

import fr.julien.entities.Classe;

public interface ClassesRepository extends CrudRepository<Classe, Long> {

}
