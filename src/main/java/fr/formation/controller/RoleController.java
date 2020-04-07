package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Role;
import fr.formation.model.User;
import fr.formation.service.IRoleService;

@RestController
@RequestMapping("/role")
@CrossOrigin("http://localhost:4200")
public class RoleController {
	
	@Autowired
	IRoleService roleService;
	
	@PostMapping("/newrole")
	public Role createRole(@RequestBody Role role) {
		return roleService.createRole(role);
	}
	
	@DeleteMapping("/{idRole}")
	public boolean deleteRole(@PathVariable long idRole) {
		return roleService.deleteRole(idRole);
	}
	
	@GetMapping("/all")
	public List<Role> getAll() {
		return roleService.getAllRoles();
}
	@GetMapping("/{idUser}")
	public Role findById(@PathVariable long idRole) {
	return roleService.getRole(idRole);
}
}
