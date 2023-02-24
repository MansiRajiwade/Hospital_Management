package dto;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Record {
  @Id
  private int id;
  private String name;
  private String date;
  private String time;
  private String Symptoms;
  
  @ManyToOne
  private Patient patients;
  

public Patient getPatients() {
	return patients;
}

public void setPatients(Patient patients) {
	this.patients = patients;
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

public String getDate() {
	return date;
}

public void setDate(String date) {
	this.date = date;
}

public String getTime() {
	return time;
}

public void setTime(String time) {
	this.time = time;
}

public String getSymptoms() {
	return Symptoms;
}

public void setSymptoms(String symptoms) {
	Symptoms = symptoms;
}


  
}
