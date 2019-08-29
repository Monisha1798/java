package hello_1208;

public class Account {

	private String name;
	private double balance;
	private static int count;
	{
		name="Jenny";
		balance=20000;
	}
	static {
		count=100;
	}
	
	public Account(){
	 super();
	 count++;
	 System.out.println("Name:"+name+" Balance:"+balance);
	 System.out.println("No.of Account:"+count);
	}
}
