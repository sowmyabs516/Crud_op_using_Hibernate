package controller;

import java.util.Scanner;

import dao.Patient_Dao;

public class Update_patient_data {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	System.out.println("enter id");
	Patient_Dao dao=new Patient_Dao();
	int id=sc.nextInt();
	dao.update(id);
	}
}
