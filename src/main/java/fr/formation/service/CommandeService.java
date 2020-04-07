package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Commande;
import fr.formation.repository.ICommandeRepository;

@Service
public class CommandeService implements ICommandeService {
	
	@Autowired
	ICommandeRepository commandeRepository;

	@Override
	public Commande createCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public List<Commande> getAllCommande() {
		return commandeRepository.findAll();
	}

	@Override
	public Boolean deleteCommande(Long idCommande) {
		try {
			commandeRepository.deleteById(idCommande);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Commande getCommande(Long idCommande) {
		Optional<Commande> commandeOptional = commandeRepository.findById(idCommande);
		Commande commande = new Commande();
		if (commandeOptional.isPresent()) {
			commande = commandeOptional.get();
		}
		return commande;
	}

	@Override
	public Commande updateCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

}
