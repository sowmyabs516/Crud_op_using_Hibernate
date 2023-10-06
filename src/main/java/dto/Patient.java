package dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String patient_name;
String address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getPatient_name() {
	return patient_name;
}
public void setPatient_name(String patient_name) {
	this.patient_name = patient_name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}


}
