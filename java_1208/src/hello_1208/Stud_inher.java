package hello_1208;

public class Stud_inher extends Person_inher {
	private String stream;
	
	public Stud_inher() {
		super();
	}
	public Stud_inher(String name) {
		//super();
		this.stream=stream;
	}
	
	//protected String getDetails() {
		//return getDetails()+"Stream:"+stream;
	//}
	@Override
	public String getDetails() {
		return super.getDetails()+"Stream:"+stream;
	}
}
