package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Commande {
	
	@Id
	@GeneratedValue
	private Long idCommande;
	private int nmbrePlat;
	
	@JoinColumn(name="idResa")
	@ManyToOne
	private Reservation resa;

	public Reservation getResa() {
		return resa;
	}

	public void setResa(Reservation resa) {
		this.resa = resa;
	}

	public Commande(int nmbrePlat, Reservation resa) {
		super();
		this.nmbrePlat = nmbrePlat;
		this.resa = resa;
	}

	public Commande() {
		super();
	}

	public Long getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(Long idCommande) {
		this.idCommande = idCommande;
	}

	public int getNmbrePlat() {
		return nmbrePlat;
	}

	public void setNmbrePlat(int nmbrePlat) {
		this.nmbrePlat = nmbrePlat;
	}

	@Override
	public String toString() {
		return "Commande [idCommande=" + idCommande + ", resa=" + resa + "]";
	}
	
	
	

}
