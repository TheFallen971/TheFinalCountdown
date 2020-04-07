package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Plats;
import fr.formation.repository.IPlatsRepository;

@Service
public class PlatsService implements IPlatsService {
	
	@Autowired
	IPlatsRepository platsRepository;

	@Override
	public Plats createPlat(Plats plat) {
		return platsRepository.save(plat);
	}

	@Override
	public List<Plats> getAllPlats() {
		return platsRepository.findAll();
	}

	@Override
	public Boolean deletePlat(Long idPlat) {
		try {
			platsRepository.deleteById(idPlat);
		}
		catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

	@Override
	public Plats getPlat(Long idPlat) {
		Optional<Plats> platsOptional = platsRepository.findById(idPlat);
		Plats plat = new Plats();
		if (platsOptional.isPresent()) {
			plat = platsOptional.get();	
		}
		return plat;
	}

	@Override
	public Plats updatePlat(Plats plat) {
		return platsRepository.save(plat);
	}

}
