package fr.formation.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.formation.model.Reservation;
import fr.formation.model.Role;
import fr.formation.model.Tables;
import fr.formation.model.User;
import fr.formation.repository.ITablesRepository;

@Service
public class TablesService implements ITablesService {
	
	@Autowired
	ITablesRepository tablesRepository;
	
	@Autowired
	IReservationService reservationService;

	@Override
	public Tables createTable(Tables table) {
		return tablesRepository.save(table);
	}

	@Override
	public List<Tables> getAllTables() {
		return tablesRepository.findAll();
	}

	@Override
	public Tables getTable(Long numTable) {
		Optional<Tables> tablesOptional = tablesRepository.findById(numTable);
		Tables table = new Tables();
		if (tablesOptional.isPresent()) {
			table = tablesOptional.get();
		}
		return table;
	}

	@Override
	public boolean deleteTable(Long numTable) {
			try {
				tablesRepository.deleteById(numTable);
			}
			catch (Exception e) {
				e.printStackTrace();
				return false;
			}
			return true;
		}

	@Override
	public Tables updateTable(Tables table) {
		return tablesRepository.save(table);
	}


}
