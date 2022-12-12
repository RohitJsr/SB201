package com.masai.Evaluationsb201;
import javax.persistence.Entity;

@Entity
public class Account {
	@ID
	private int id;
	private String email;
	private String address;
	private double salary;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public Account() {
		super();
	}
	public Account(int id, String email, String address, double salary) {
		super();
		this.id = id;
		this.email = email;
		this.address = address;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", email=" + email + ", address=" + address + ", salary=" + salary + "]";
	}
	
	
	

}
