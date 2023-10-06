package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Patient;

public class Patient_Dao {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		

	public void save(Patient patient) {
		entityTransaction.begin();
		entityManager.merge(patient);
		entityTransaction.commit();
		
	}


	public void update(int i) {
		Patient p=entityManager.find(Patient.class, 2);
		if(p!=null){
			entityTransaction.begin();
			p.setAddress("den");
			entityManager.merge(p);
			entityTransaction.commit();
		}
		else{
			System.out.println("No Data");
		}
	}


	public void fetchbyId(int i) {
		Patient p=entityManager.find(Patient.class, 1);
		if(p!=null){
			System.out.println(p.getId());
			System.out.println(p.getPatient_name());
			System.out.println(p.getAddress());
		}
		else{
			System.out.println("No Data");
		}
	}

	public void removedata(int id) {
		Patient p=entityManager.find(Patient.class, id);
		entityTransaction.begin();
		entityManager.remove(p);
		entityTransaction.commit();
		System.out.println("Removed");
	}
}
