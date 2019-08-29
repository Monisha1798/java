package hello_eg;

public class Emp {
 
	protected String name;
	protected String dept;
	public Emp() {
		
	}
	
	public Emp(String name, String dept) {
		
		this.name=name;
		this.dept=dept;
		
	}
	
	protected String getDetails() {
		
		return "Name "+name+" Dept "+dept;
	}
}
