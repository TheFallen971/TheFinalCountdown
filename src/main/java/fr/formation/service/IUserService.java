package fr.formation.service;

import java.util.List;

import fr.formation.model.User;

public interface IUserService {
	
	public User createUser(User user);
	public List<User> getAllUsers();
	public boolean deleteUser(Long idUser);
	public User updateUser(User user);
	public User findByLogin(String login);
	public User login(String login, String password);
	public User findByRole(Long idRole);
	public User getUser(Long idUser);

}
