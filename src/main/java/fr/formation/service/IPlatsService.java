package fr.formation.service;

import java.util.List;

import fr.formation.model.Plats;

public interface IPlatsService {
	
	public Plats createPlat(Plats plat);
	public List<Plats> getAllPlats();
	public Boolean deletePlat(Long idPlat);
	public Plats getPlat(Long idPlat);
	public Plats updatePlat(Plats plat);

}
