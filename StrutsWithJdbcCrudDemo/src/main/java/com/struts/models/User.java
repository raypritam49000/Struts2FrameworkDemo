package com.struts.models;

public class User {
	private Long id;
	private String name;
	private String city;
	private String salary;
	private String email;
	
	

	public User() {
		super();
	}

	public User(Long id, String name, String city, String salary, String email) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", city=" + city + ", salary=" + salary + ", email=" + email + "]";
	}

}