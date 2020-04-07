package fr.formation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.formation.model.Plats;

public interface IPlatsRepository extends JpaRepository<Plats, Long>{

}
