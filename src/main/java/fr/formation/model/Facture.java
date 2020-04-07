package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Facture {
	
	@Id
	@GeneratedValue
	private Long idFacture;
	private double prixTotal;
	
	@JoinColumn(name="idCommande")
	@ManyToOne
	private Commande commande;

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}

	public Facture(double prixTotal, Commande commande) {
		super();
		this.prixTotal = prixTotal;
		this.commande = commande;
	}

	public Facture() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdFacture() {
		return idFacture;
	}

	public void setIdFacture(Long idFacture) {
		this.idFacture = idFacture;
	}

	public double getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(double prixTotal) {
		this.prixTotal = prixTotal;
	}


	@Override
	public String toString() {
		return "Facture [idFacture=" + idFacture + ", prixTotal=" + prixTotal
				+ ", commande=" + commande + "]";
	}
}
