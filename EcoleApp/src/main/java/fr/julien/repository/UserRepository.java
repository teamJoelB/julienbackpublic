package fr.julien.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import fr.julien.entities.User;

public interface UserRepository extends CrudRepository<User, Long> {

	public Optional<User> findByLoginAndPassword(String login, String password);
}
