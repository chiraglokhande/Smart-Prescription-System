package smartPrescriptionModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pharmacist {
	
	
@Id
@GeneratedValue(strategy =GenerationType.IDENTITY)
private int id;

private String name;

private String email;

private String username;

private String password;

public Pharmacist() {
	super();
	// TODO Auto-generated constructor stub
}

public Pharmacist(String name, String email, String username, String password) {
	super();

	this.name = name;
	this.email = email;
	this.username = username;
	this.password = password;
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

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}



	
}
