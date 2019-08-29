package hello_eg;

public class Perm_emp extends Emp {
	
	 private int salary;
	 
	 public Perm_emp() {
		 
	 }
	 public Perm_emp(int salary) {
		 super("Bob","Developer");
		 this.salary=salary;
	 }
	 public String getDetails() {
			return super.getDetails()+" Salary:"+salary;
		}

}
