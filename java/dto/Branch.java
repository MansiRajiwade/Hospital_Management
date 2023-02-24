package dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Branch {
  @Id
  private int id;
  private String name;
  
  @OneToOne
  private Address addresses;
  
  @OneToMany
  private List<Record> records;

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

public Address getAddresses() {
	return addresses;
}

public void setAddresses(Address addresses) {
	this.addresses = addresses;
}

public List<Record> getRecords() {
	return records;
}

public void setRecords(List<Record> records) {
	this.records = records;
}
  
}
