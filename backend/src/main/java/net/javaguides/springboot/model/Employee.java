package net.javaguides.springboot.model;


import jakarta.persistence.*;


@Entity
@Table(name = "employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
  private long id;

	@Column(name ="first_name")
  private String firstname;
	

	@Column(name = "designation")
  private String designation;
	
	@Column(name = "email_id")
  private String emailid;
  
 
  
  @Column(name = "flat_no")
  private  String flatno;
  
  @Column(name = "street")
  private  String street;
  
  @Column(name = "city")
  private String city;
  
  @Column(name = "state")
  private  String state;
  
  @Column(name = "pincode")
  private Integer pincode;
  
  @Column(name = "dateofbirth")
  private  String  dateofbirth;
  
  
//  @Column(name = "file_name")
//  private String fileName;
//
//  @Column(name = "file_type")
//  private String fileType;




 





public Employee() {
	  
  }
  

public Employee(String firstname, String designation, String emailid ,String flatno, String street, String city, String state, Integer pincode, String dateofbirth) {
	super();
	this.firstname = firstname;
	this.designation = designation;
	this.emailid = emailid;
	this.flatno = flatno;
	this.street = street;
	this.city = city;
	this.state = state;
	this.pincode = pincode;
	this.dateofbirth = dateofbirth;
}
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getDesignation() {
	return designation;
}
public void setDesignation(String designation) {
	this.designation = designation;
}
public String getEmailid() {
	return emailid;
}
public void setEmailid(String emailid) {
	this.emailid = emailid;
} 
  
public String getDateofbirth() {
	return dateofbirth;
}
public void setDateofbirth(String dateofbirth) {
	this.dateofbirth = dateofbirth;
}
public String getFlatno() {
	return flatno;
}
public void setFlatno(String flatno) {
	this.flatno = flatno;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public String getState() {
	return state;
}
public void setState(String state) {
	this.state = state;
}
public Integer getPincode() {
	return pincode;
}
public void setPincode(Integer pincode) {
	this.pincode = pincode;
}
  
}
  
