package smartPrescriptionModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Cause {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generate ID
	private int id;

	private String name;

	// Default Constructor (Required by Hibernate)
	public Cause() {
	}

	// Parameterized Constructor
	public Cause(String name) {
		this.name = name;
	}

	// Getters and Setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}



}
