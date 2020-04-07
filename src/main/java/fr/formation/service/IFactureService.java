package fr.formation.service;

import java.util.List;

import fr.formation.model.Facture;

public interface IFactureService {
	
	public Facture createFacture(Facture facture);
	public List<Facture> getAllFactures();
	public Facture getFacture(Long idFacture);

}
