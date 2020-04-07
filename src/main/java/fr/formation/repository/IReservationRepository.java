package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import fr.formation.model.Reservation;
import fr.formation.model.User;

public interface IReservationRepository extends JpaRepository<Reservation, Long>{
	
	public User findByUser(User idUser);

}
