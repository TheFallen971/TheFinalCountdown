package fr.formation.service;

import java.util.List;

import fr.formation.model.Reservation;
import fr.formation.model.Tables;

public interface ITablesService {
	
	public Tables createTable(Tables table);
	public List<Tables> getAllTables();
	public Tables getTable(Long numTable);
	public boolean deleteTable(Long numTable);
	public Tables updateTable(Tables table);
}
