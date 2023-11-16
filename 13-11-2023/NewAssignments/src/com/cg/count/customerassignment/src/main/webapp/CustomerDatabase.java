package customerjava;

import javax.annotation.Generated;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer")
public class CustomerDatabase {
   @Id
   @Column(name="id")
	private int id;
   
   @Column(name="name")
   private String name;
   
   @Column(name="email")
   private String email;
   
   @Column(name="phonenumber")
   private  int phonenumber;
   
   @Column(name="address")
   private String address;

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

public int getPhonenumber() {
	return phonenumber;
}

public void setPhonenumber(int phonenumber) {
	this.phonenumber = phonenumber;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public CustomerDatabase(int id, String name, String email, int phonenumber, String address) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
	this.phonenumber = phonenumber;
	this.address = address;
}

public CustomerDatabase() {
	super();
}

   
   
	
}
