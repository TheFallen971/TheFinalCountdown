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

import fr.formation.model.Plats;
import fr.formation.service.IPlatsService;


@RestController
@RequestMapping("plats")
@CrossOrigin("http://localhost:4200")
public class PlatsController {
	
	@Autowired
	IPlatsService platsService;
	
	@GetMapping("/all")
	public List<Plats> getAll() {
		return platsService.getAllPlats();
}
	@GetMapping("/{idPlat}")
	public Plats findById(@PathVariable long idPlat) {
	return platsService.getPlat(idPlat);
}
	@PostMapping("/newplats")
	public Plats createPlat(@RequestBody Plats plat) {
		return platsService.createPlat(plat);
}
	@DeleteMapping("/{idPlat}")
	public boolean deletePlats(@PathVariable long idPlat) {
		return platsService.deletePlat(idPlat);
	}
	
	@PutMapping("/{idPlat}")
	public Plats updatePlat(@PathVariable long idPlat, @RequestBody Plats plat) {
		Plats plat1 = platsService.getPlat(idPlat);
		plat1.setNomPlat(plat.getNomPlat());
		plat1.setPrixPlat(plat.getPrixPlat());
		plat1.setCommande(plat.getCommande());
		return platsService.updatePlat(plat);
}
}

