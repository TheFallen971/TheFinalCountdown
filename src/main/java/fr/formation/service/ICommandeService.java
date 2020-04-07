package fr.formation.service;

import java.util.List;

import fr.formation.model.Commande;

public interface ICommandeService {
	
	public Commande createCommande(Commande commande);
	public List<Commande> getAllCommande();
	public Boolean deleteCommande(Long idCommande);
	public Commande getCommande(Long idCommande);
	public Commande updateCommande(Commande Commande);
}
