package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.User;
import fr.formation.service.IUserService;

@RestController
@RequestMapping("user")
@CrossOrigin("http://localhost:4200")
public class UserController {
	
	@Autowired
	IUserService userService;

	@GetMapping("/all")
	public List<User> getAll() {
		return userService.getAllUsers();
}
	@GetMapping("/{idUser}")
	public User findById(@PathVariable long idUser) {
	return userService.getUser(idUser);
}
	@PostMapping("/newuser")
	public User createUser(@RequestBody User user) {
		return userService.createUser(user);
}
	@PutMapping("/{idUser}")
	public User updateUser(@PathVariable long idUser, @RequestBody User user) {
		User user1 = userService.getUser(idUser);
		user1.setNomUser(user.getNomUser());
		user1.setPrenomUser(user.getPrenomUser());
		user1.setNumTel(user.getNumTel());
		user1.setRole(user.getRole());
		user1.setLogin(user.getLogin());
		user1.setPassword(user.getPassword());
		return userService.updateUser(user);
}
	
	@DeleteMapping("/{idUser}")
	public boolean deleteUser(@PathVariable long idUser) {
		return userService.deleteUser(idUser);
	} 
	
	@PostMapping("login")
	public User login(@RequestBody User login) {
		return userService.login(login.getLogin(), login.getPassword());
	}
}
