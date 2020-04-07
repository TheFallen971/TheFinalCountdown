package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Commande;
import fr.formation.model.Plats;
import fr.formation.service.ICommandeService;

@RestController
@RequestMapping("commande")
@CrossOrigin("http://localhost:4200")
public class CommandeController {
	
	@Autowired
	ICommandeService commandeService;
	
	@GetMapping("/all")
	public List<Commande> getAll() {
		return commandeService.getAllCommande();
}
	@GetMapping("/{idCommande}")
	public Commande findById(@PathVariable long idCommande) {
	return commandeService.getCommande(idCommande);
}
	@PostMapping("/newcommande")
	public Commande createCommande(@RequestBody Commande commande) {
		return commandeService.createCommande(commande);
}
	@DeleteMapping("/{idCommande}")
	public boolean deleteCommande(@PathVariable long idCommande) {
		return commandeService.deleteCommande(idCommande);
	}
	
	@PutMapping("/{idCommande}")
	public Commande updateCommande(@PathVariable long idCommande, @RequestBody Commande commande) {
		Commande commande1 = commandeService.getCommande(idCommande);
		commande1.setNmbrePlat(commande.getNmbrePlat());
		commande1.setResa(commande.getResa());
		return commandeService.updateCommande(commande);
}
}
