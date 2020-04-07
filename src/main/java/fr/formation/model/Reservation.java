package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Reservation {
	
	@Id
	@GeneratedValue
	private Long idResa;
	private String nomResa;
	private String date;
	private String heure;
	private int nmbrePersonnes;
	
	@JoinColumn(name="User")
	@ManyToOne
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Reservation(String nomResa, String date, String heure, int nmbrePersonnes, User user) {
		super();
		this.nomResa = nomResa;
		this.date = date;
		this.heure = heure;
		this.nmbrePersonnes = nmbrePersonnes;
		this.user = user;
	}

	public Reservation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdResa() {
		return idResa;
	}

	public void setIdResa(Long idResa) {
		this.idResa = idResa;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public int getNmbrePersonnes() {
		return nmbrePersonnes;
	}

	public void setNmbrePersonnes(int nmbrePersonnes) {
		this.nmbrePersonnes = nmbrePersonnes;
	}

	public String getNomResa() {
		return nomResa;
	}

	public void setNomResa(String nomResa) {
		this.nomResa = nomResa;
	}

	public String getHeure() {
		return heure;
	}

	public void setHeure(String heure) {
		this.heure = heure;
	}

	@Override
	public String toString() {
		return "Reservation [idResa=" + idResa + ", nomResa=" + nomResa + ", date=" + date + ", nmbrePersonnes="
				+ nmbrePersonnes + ", user=" + user + "]";
	}




	
	
	
	
	
	
}
