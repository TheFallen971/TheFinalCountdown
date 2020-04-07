package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Plats {
	
	@Id
	@GeneratedValue
	private Long idPlat;
	private String nomPlat;
	private double prixPlat;
	
	@JoinColumn(name="idCommande")
	@ManyToOne
	private Commande commande;

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Plats(String nomPlat, double prixPlat, Commande commande) {
		super();
		this.nomPlat = nomPlat;
		this.prixPlat = prixPlat;
		this.commande = commande;
	}

	public Plats() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdPlat() {
		return idPlat;
	}

	public void setIdPlat(Long idPlat) {
		this.idPlat = idPlat;
	}

	public String getNomPlat() {
		return nomPlat;
	}

	public void setNomPlat(String nomPlat) {
		this.nomPlat = nomPlat;
	}

	public double getPrixPlat() {
		return prixPlat;
	}

	public void setPrixPlat(double prixPlat) {
		this.prixPlat = prixPlat;
	}

	@Override
	public String toString() {
		return "Plats [idPlat=" + idPlat + ", nomPlat=" + nomPlat + ", commande="
				+ commande + "]";
	}
	
	

}
