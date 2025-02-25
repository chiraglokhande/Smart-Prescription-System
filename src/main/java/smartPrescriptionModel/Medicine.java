package smartPrescriptionModel;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Medicine {
	
	@Id
	private int id;
	 private String name;
	 private double price;
	  

	 @OneToOne(cascade = CascadeType.ALL)  // Automatically persist Cause
	 @JoinColumn(name = "cause_id")
	 Cause cause;
	 
	 
	 
	public Medicine() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Medicine(int id, String name, double price, Cause cause) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.cause=cause;
	}
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
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Cause getCause() {
		return cause;
	}
	public void setCause(Cause cause) {
		this.cause = cause;
	}


}
