package fr.formation;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import fr.formation.model.Commande;
import fr.formation.model.Facture;
import fr.formation.model.Plats;
import fr.formation.model.Reservation;
import fr.formation.model.Role;
import fr.formation.model.Tables;
import fr.formation.model.User;
import fr.formation.service.ICommandeService;
import fr.formation.service.IFactureService;
import fr.formation.service.IPlatsService;
import fr.formation.service.IReservationService;
import fr.formation.service.IRoleService;
import fr.formation.service.ITablesService;
import fr.formation.service.IUserService;

@SpringBootApplication
public class TheFinalCountdownApplication implements CommandLineRunner {

	@Autowired
	IUserService userService;
	@Autowired
	IRoleService roleService;
	@Autowired
	IReservationService reservationService;
	@Autowired
	ITablesService tablesService;
	@Autowired
	ICommandeService commandeService;
	@Autowired
	IFactureService factureService;
	@Autowired
	IPlatsService platsService;
	
	public static void main(String[] args) {
		SpringApplication.run(TheFinalCountdownApplication.class, args);
		System.out.println("Ca marche!");
	}

	@Override
	public void run(String... args) throws Exception {
		
//		Role role1 = new Role("Utilisateur");
//		Role role2 = new Role("Serveur");
//		Role role3 = new Role("Manager");
//		roleService.createRole(role1);
//		roleService.createRole(role2);
//		roleService.createRole(role3);
//		Role rol1 = roleService.getRole(1L);
//		Role rol2 = roleService.getRole(2L);
//		Role rol3 = roleService.getRole(3L);
//		User u1 = new User("MOLINIE", "Vincent", 0654, "vincentm@gmail.com", "finalV", rol3);
//		User u2 = new User("PAVADE", "Jimmy", 0555, "jimmyp@gmail.com", "finalJ", rol2);
//		User u3 = new User("BOURQUIN", "Solene", 0543, "soleneb@gmail.com", "finalS", rol3);
//		User u4 = new User("PIRIOU", "Julie", 0654, "juliep@gmail.com", "julieP", rol3);
//		User u5 = new User("LOUBEYRE", "Nicolas", 4189, "nicolasl@gmail.com", "nicolasl", rol1);
//		userService.createUser(u1);
//		userService.createUser(u2);
//		userService.createUser(u3);
//		userService.createUser(u4);
//		userService.createUser(u5);
//		User user1 = userService.getUser(8L);
//		User user2 = userService.getUser(7L);
//		Reservation resa1 = new Reservation("LOUBEYRE", "2020-04-08", 4, user1);
//		Reservation resa2 = new Reservation("PIRIOU", "2020-04-10", 10, user2);
//		reservationService.createResa(resa1);
//		reservationService.createResa(resa2);
//		Reservation r1 = reservationService.getReservation(9L);
//		Tables table1 = new Tables(6, r1);
//		tablesService.createTable(table1);
//		Reservation re1 = reservationService.getReservation(11L);
//		Commande com1 = new Commande(7, resa1);
//		commandeService.createCommande(com1);
//		Commande c1 = commandeService.getCommande(12L);
//		Plats plat1 = new Plats("Boeuf bourgignon", true, 20, c1);
//		platsService.createPlat(plat1);
//		Facture facture1 = new Facture(20, "PAVADE Jimmy", c1);
//		factureService.createFacture(facture1);
	}

}
