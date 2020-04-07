package fr.formation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Tables {
	
	@Id
	@GeneratedValue
	private Long numTable;
	private int nmbrePlace;
	
	@JoinColumn(name="idResa")
	@ManyToOne
	private Reservation resa;

	public Reservation getResa() {
		return resa;
	}

	public void setResa(Reservation resa) {
		this.resa = resa;
	}

	public Tables(int nmbrePlace, Reservation resa) {
		super();
		this.nmbrePlace = nmbrePlace;
		this.resa = resa;
	}

	public Tables() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getNumTable() {
		return numTable;
	}

	public void setNumTable(Long numTable) {
		this.numTable = numTable;
	}

	public int getNmbrePlace() {
		return nmbrePlace;
	}

	public void setNmbrePlace(int nmbrePlace) {
		this.nmbrePlace = nmbrePlace;
	}

	@Override
	public String toString() {
		return "Tables [numTable=" + numTable + ", nmbrePlace=" + nmbrePlace + ", resa=" + resa + "]";
	}
	
	

}
