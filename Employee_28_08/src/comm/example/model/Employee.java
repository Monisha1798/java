package comm.example.model;

import java.io.Serializable;


public class Employee implements Serializable{
	
	private static final long serialVersionUID = -3975765824663499414L;
	
	private String name;
	private String password;
	private String email;
	private String country;
	
	public Employee()
	{
		super();
	}

	public Employee(String name, String password, String email,String country) {
		super();
	
		this.name = name;
		this.password = password;
		this.email = email;
		this.country=country;
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

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
}