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

import fr.formation.model.Tables;
import fr.formation.model.User;
import fr.formation.service.ITablesService;

@RestController
@RequestMapping("tables")
@CrossOrigin("http://localhost:4200")
public class TablesController {
	
	@Autowired
	ITablesService tablesService;
	
	@GetMapping("/all")
	public List<Tables> getAll() {
		return tablesService.getAllTables();
}
	@GetMapping("/{numTable}")
	public Tables findById(@PathVariable long numTable) {
	return tablesService.getTable(numTable);
}
	@PostMapping("/newtables")
	public Tables createTable(@RequestBody Tables table) {
		return tablesService.createTable(table);

}
	@DeleteMapping("/{numTable}")
	public boolean deleteTable(@PathVariable long numTable) {
		return tablesService.deleteTable(numTable);
	}
	
	@PutMapping("/{numTable}")
	public Tables updateTable(@PathVariable long numTable, @RequestBody Tables table) {
		Tables table1 = tablesService.getTable(numTable);
		table1.setResa(table.getResa());
		return tablesService.updateTable(table);
}
}

