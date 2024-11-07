package br.juliok.crud.beans;

public class Employee {
	private int id;
	private String name;
	private String email;
	private String phone;
	private String address;
	
	
	public Employee() {
		super();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", photo=" + phone + ", address="
				+ address + "]";
	}
	public Employee(int id, String name, String email, String photo, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phone = photo;
		this.address = address;
	}
	public Employee(String name, String email, String photo, String address) {
		super();
		this.name = name;
		this.email = email;
		this.phone = photo;
		this.address = address;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
