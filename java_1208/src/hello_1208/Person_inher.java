package hello_1208;

public class Person_inher {
	
	protected String name;
	protected String addr;
	public Person_inher() {
		System.out.println("inside person class");
	}
	public Person_inher(String name,String addr)
	{
		this.name=name;
		this.addr=addr;
		System.out.println("Parameterized cons");
	}
	public String getDetails() {
		return "name"+name+"address"+addr;
	}
}
