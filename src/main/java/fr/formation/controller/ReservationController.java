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

import fr.formation.model.Reservation;
import fr.formation.service.IReservationService;

@RestController
@RequestMapping("reservation")
@CrossOrigin("http://localhost:4200")
public class ReservationController {
	
	@Autowired
	IReservationService reservationService;
	
	@GetMapping("/all")
	public List<Reservation> getAll() {
		return reservationService.getAllResa();
}
	@GetMapping("/{idResa}")
	public Reservation findById(@PathVariable long idResa) {
	return reservationService.getReservation(idResa);
}
	@PostMapping("/newreservation")
	public Reservation createResa(@RequestBody Reservation resa) {
		return reservationService.createResa(resa);
}
	@DeleteMapping("/{idResa}")
	public boolean deleteResa(@PathVariable long idResa) {
		return reservationService.deleteResa(idResa);
	}
	
	@PutMapping("/{idResa}")
	public Reservation updateResa(@PathVariable long idResa, @RequestBody Reservation resa) {
		Reservation resa1 = reservationService.getReservation(idResa);
		resa1.setDate(resa.getDate());
		resa1.setNmbrePersonnes(resa.getNmbrePersonnes());
		resa1.setNomResa(resa.getNomResa());
		resa1.setUser(resa.getUser());
		resa1.setHeure(resa.getDate());
		return reservationService.updateResa(resa);
}
}
