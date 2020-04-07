package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Role;
import fr.formation.model.User;
import fr.formation.repository.IRoleRepository;

@Service
public class RoleService implements IRoleService {

	@Autowired
	IRoleRepository roleRepository;
	
	@Override
	public Role createRole(Role role) {
		return roleRepository.save(role);
	}

	@Override
	public boolean deleteRole(Long idRole) {
		try {
			roleRepository.deleteById(idRole);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Role getRole(Long idRole) {
		Optional<Role> RoleOptional = roleRepository.findById(idRole);
		Role role = new Role();
		if (RoleOptional.isPresent()) {
			role = RoleOptional.get();
			return role;
		}
		return null;
	}

	@Override
	public List<Role> getAllRoles() {
		return roleRepository.findAll();
	}

}
