package hello_eg;

public class Cont_Emp extends Emp {
	
	private int wages_hr;
	public Cont_Emp() {
		 
	 }
	 public Cont_Emp(int wages_hr) {
		 super("Adam","Tester");
		 this.wages_hr=wages_hr;
	 }
	 public String getDetails() {
			return super.getDetails()+" Hourly Wages:"+wages_hr;
		}
}
