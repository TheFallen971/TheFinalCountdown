package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Reservation;
import fr.formation.model.User;
import fr.formation.repository.IReservationRepository;

@Service
public class ReservationService implements IReservationService {
	
	@Autowired
	IReservationRepository reservationRepository;

	@Override
	public Reservation createResa(Reservation resa) {
		return reservationRepository.save(resa);
	}

	@Override
	public List<Reservation> getAllResa() {
		return reservationRepository.findAll();
	}
	
	@Override
	public Boolean deleteResa(Long idResa) {
		try {
			reservationRepository.deleteById(idResa);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Reservation updateResa(Reservation resa) {
		return reservationRepository.save(resa);
	}

	@Override
	public Reservation getReservation(Long idResa) {
		Optional<Reservation> ReservationOptional = reservationRepository.findById(idResa);
		Reservation resa1 = new Reservation();
		if (ReservationOptional.isPresent()) {
		resa1 = ReservationOptional.get();
			return resa1;
		}
		return null;
	}

}
