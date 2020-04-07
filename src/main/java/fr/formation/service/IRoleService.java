package fr.formation.service;

import java.util.List;

import fr.formation.model.Role;

public interface IRoleService {
	
	public Role createRole(Role role);
	public List<Role> getAllRoles();
	public boolean deleteRole(Long idRole);
	public Role getRole(Long idRole);

}
