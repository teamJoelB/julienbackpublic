package fr.julien.repository;

import org.springframework.data.repository.CrudRepository;

import fr.julien.entities.Role;

public interface RoleRepository extends CrudRepository<Role, Long>{

}
