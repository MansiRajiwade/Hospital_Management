package dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.Address;
import dto.Branch;
import dto.Disease;
import dto.Hospital;
import dto.Patient;
import dto.Record;

public class HospitalDriver {
  public static void main(String[] args) {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("mansi");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Hospital h=new Hospital();
	h.setId(1101);
	h.setName("Apollo");
	
	Branch b=new Branch();
	b.setId(1010);
	b.setName("Maharashtra");
	
	Branch b1=new Branch();
	b1.setId(1020);
	b1.setName("AP");
	
	List<Branch> branches=new ArrayList<Branch>();
	branches.add(b);
	branches.add(b1);
	
	h.setBranches(branches);
	
	Address a=new Address();
	a.setId(1111);
	a.setLocation("Pune");
	
	Address a1=new Address();
	a1.setId(1122);
	a1.setLocation("Abc");
	
	b.setAddresses(a);
	b1.setAddresses(a1);
	
	Record r=new Record();
	r.setId(110);
	r.setName("Avani");
	r.setDate("14-08-21");
	r.setTime("2:15");
	r.setSymptoms("Fever");
	
	Record r1=new Record();
	r1.setId(120);
	r1.setName("kartik");
	r1.setDate("20-01-22");
	r1.setTime("4:00");
	r1.setSymptoms("Cold");
	
	
	
	List<Record> records=new ArrayList<Record>();
	records.add(r);
	records.add(r1);
	
	b.setRecords(records);
//	b1.setRecords(records);
	
	Patient p=new Patient();
	p.setId(011);
	p.setName("Amey");
	p.setAge(25);
	
	Patient p1=new Patient();
	p1.setId(012);
	p1.setName("Bhavana");
	p1.setAge(26);

	List<Patient> patients=new ArrayList<Patient>();
	patients.add(p);
	patients.add(p1);
	
	r.setPatients(p);
	r1.setPatients(p1);
	
	
	Disease d=new Disease();
	d.setId(100);
	d.setName("Fever");

    Disease d1=new Disease();
    d1.setId(200);
    d1.setName("Cold");
    
    List<Disease> diseases=new ArrayList<Disease>();
    diseases.add(d);
    diseases.add(d1);
    
    d.setPatients(patients);
    d1.setPatients(patients);
    p.setDiseases(diseases);
    p1.setDiseases(diseases);
    
    et.begin();
    em.persist(h);
    em.persist(b);
    em.persist(b1);
    em.persist(a);
    em.persist(a1);
    em.persist(r);
    em.persist(r1);
    em.persist(p);
    em.persist(p1);
    em.persist(d);
    em.persist(d1);
    et.commit();
	
	
}
}
