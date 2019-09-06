package com.mycompany.spring_demo_04_09.bean;

public class Employee {
	

		private int id;
	private String firstName;
	private String lastName;	
	private Address address;
	private long ph_num;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public long getPh_num() {
		return ph_num;
	}
	public void setPh_num(long ph_num) {
		this.ph_num = ph_num;
	}
	
	public Employee()
	{
		super();
	}
	public Employee(int id, String firstName, String lastName, Address address, long ph_num) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.address=address;
		this.ph_num = ph_num;
	}
	public String getEmpAddress()
	{
		return address.EmpAddress();
	}
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", ph_num=" + ph_num + "]";
	}
	public String getDetails()
	{
		return toString();
	}
	}
