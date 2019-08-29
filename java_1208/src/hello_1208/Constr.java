package hello_1208;

public class Constr {

	private int x;
	private int y;
	private int z;
	
	public Constr() {
		this(10);
	}
	public Constr(int x) {
		this(x,20);
	}
	public Constr(int x, int y) {

		this(x,y,30);
	}
public Constr(int x, int y,int z) {
	
	this.x=x;
	this.y=y;
	this.z=z;
}
public String getXYZ()
{
	return "X "+x+" Y "+y+"Z "+z;
}
}
