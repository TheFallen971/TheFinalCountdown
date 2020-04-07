package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private Long idRole;
	private String role;

	public Role(String role) {
		super();
		this.role = role;
	}

	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdRole() {
		return idRole;
	}

	public void setIdRole(Long idRole) {
		this.idRole = idRole;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	

	@Override
	public String toString() {
		return "Role [idRole=" + idRole + ", role=" + role + "]";
	}
	
	

}
