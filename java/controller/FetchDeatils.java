package controller;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import dto.Disease;
import dto.Patient;


public class FetchDeatils {
	static EntityManagerFactory emf=Persistence.createEntityManagerFactory("mansi");
	static EntityManager em=emf.createEntityManager();
	static EntityTransaction et=em.getTransaction();
	
  public static void main(String[] args) {
	
	Scanner sc=new Scanner(System.in);
	
	Query q=em.createQuery("Select a from Disease a");
	List<Disease> diseases=q.getResultList();
	for (Disease disease : diseases) {
		System.out.println(disease.getId()+ " "+ disease.getName());
		
	}
	
	int id=sc.nextInt();
	listOfPatient(id);
}

private static void listOfPatient(int id) {
	
  Disease d=em.find(Disease.class, id);
  List<Patient> patients= d.getPatients();
  
  
}
}
