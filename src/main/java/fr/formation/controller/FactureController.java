package fr.formation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.formation.model.Facture;
import fr.formation.service.IFactureService;

@RestController
@RequestMapping("facture")
@CrossOrigin("http://localhost:4200")
public class FactureController {
	
	@Autowired
	IFactureService factureService;
	
	@GetMapping("/all")
	public List<Facture> getAll() {
		return factureService.getAllFactures();
}
	@GetMapping("/{idFacture}")
	public Facture findById(@PathVariable long idFacture) {
	return factureService.getFacture(idFacture);
}
	@PostMapping("/newfacture")
	public Facture createFacture(@RequestBody Facture facture) {
		return factureService.createFacture(facture);
}
}
