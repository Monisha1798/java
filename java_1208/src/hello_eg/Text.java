package hello_eg;

//import hello_1208.MyDate;
import hello_1208.Constr;

public class Text {
	
	public static void main(String args[]) {
		
		//MyDate myDate=null;
	    //myDate = new MyDate();
	    //myDate.createDate(19,10,1997);
	    //System.out.println(myDate.getDate());
	    /*Constr myCons=null;
	    myCons=new Constr();
	    System.out.println(myCons.getXYZ());*/
		
		Emp e= null;
		e= new Emp();
		e=new Perm_emp(20000);
		System.out.println(e.getDetails());
		e=new Cont_Emp(1000);    
		System.out.println(e.getDetails());
	    
	}

}

//new MyDate().createDate(8,10,1997);   