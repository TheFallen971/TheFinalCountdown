package fr.formation.service;

import java.util.List;

import fr.formation.model.Reservation;

public interface IReservationService {
	
	public Reservation createResa(Reservation resa);
	public List<Reservation> getAllResa();
	public Boolean deleteResa(Long idResa);
	public Reservation updateResa(Reservation resa);
	public Reservation getReservation(Long idResa);
}
