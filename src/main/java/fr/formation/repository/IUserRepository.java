package fr.formation.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Role;
import fr.formation.model.User;

public interface IUserRepository extends JpaRepository<User, Long>{

	public Optional<User> findByLogin(String login);
	public User findByRole(Role role);
}
