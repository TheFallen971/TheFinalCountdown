package fr.formation.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class User {
	
	@Id
	@GeneratedValue
	private Long idUser;
	private String nomUser;
	private String prenomUser;
	private int numTel;
	
	@JoinColumn(name="Role")
	@ManyToOne
	private Role role;
	
	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Column(unique = true)
	private String login;
	private String password;

	public User(String nomUser, String prenomUser, int numTel, String login, String password, Role role) {
		super();
		this.nomUser = nomUser;
		this.prenomUser = prenomUser;
		this.numTel = numTel;
		this.login = login;
		this.password = password;
		this.role= role;
	}

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdUser() {
		return idUser;
	}

	public void setIdUser(Long idUser) {
		this.idUser = idUser;
	}

	public String getNomUser() {
		return nomUser;
	}

	public void setNomUser(String nomUser) {
		this.nomUser = nomUser;
	}

	public String getPrenomUser() {
		return prenomUser;
	}

	public void setPrenomUser(String prenomUser) {
		this.prenomUser = prenomUser;
	}

	public int getNumTel() {
		return numTel;
	}

	public void setNumTel(int numTel) {
		this.numTel = numTel;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [idUser=" + idUser + ", nomUser=" + nomUser + ", prenomUser=" + prenomUser + ", numTel=" + numTel
				+ ", role=" + role + ", login=" + login + ", password=" + password + "]";
	}


	
	
	
	
	
	
	

}
