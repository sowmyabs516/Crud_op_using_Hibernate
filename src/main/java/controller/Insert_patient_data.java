package controller;

import dao.Patient_Dao;
import dto.Patient;

public class Insert_patient_data {
public static void main(String[] args) {
	Patient patient=new Patient();
	patient.setId(2);
	patient.setPatient_name("bffrtg");
	patient.setAddress("brhbyt");
	
	Patient_Dao dao=new Patient_Dao();
	dao.save(patient);
	System.out.println("Data inserted");
}
}
