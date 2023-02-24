package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Patient {
 @Id
 private int id;
 private String name;
 private int age;
 
 @ManyToMany
 private List<Disease> diseases;

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

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public List<Disease> getDiseases() {
	return diseases;
}

public void setDiseases(List<Disease> diseases) {
	this.diseases = diseases;
}
 
}
