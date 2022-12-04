package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SZERZOK database table.
 * 
 */
@Entity
@NamedQuery(name="Szerzok.findAll", query="SELECT s FROM Szerzok s")
public class Szerzok implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long id;

	private String nev;

	public Szerzok() {
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNev() {
		return this.nev;
	}

	public void setNev(String nev) {
		this.nev = nev;
	}

}