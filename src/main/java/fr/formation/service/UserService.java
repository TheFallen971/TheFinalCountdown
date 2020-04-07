package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import fr.formation.model.Role;
import fr.formation.model.User;
import fr.formation.repository.IUserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	IUserRepository userRepository;
	
	@Autowired
	IRoleService roleService;
	
	@Autowired
	BCryptPasswordEncoder cryptageService;
	
	@Bean
	BCryptPasswordEncoder PasswordEncoder() {
		return new BCryptPasswordEncoder();
	}

	@Override
	public User createUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public User findByLogin(String login) {

		Optional<User> optionalUser = userRepository.findByLogin(login);
		User user1 = new User();
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		}
		return user1;
		
	}
	
	@Override
	public User login(String login, String password) {
		User user = new User();
		user = this.findByLogin(login);
		if (cryptageService.matches(password, user.getPassword())) {
		return user;
	}
		return null;
}

	@Override
	public boolean deleteUser(Long idUser) {
		try {
			userRepository.deleteById(idUser);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	@Override
	public User findByRole(Long idRole) {
		try {
			Role role = roleService.getRole(idRole);
			return userRepository.findByRole(role);
		}
		catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	@Override
	public User getUser(Long idUser) {
		Optional<User> UserOptional = userRepository.findById(idUser);
		User user = new User();
		if (UserOptional.isPresent()) {
			user = UserOptional.get();
			return user;
		}
		return null;
	}

}
