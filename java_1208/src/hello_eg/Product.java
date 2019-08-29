package hello_eg;

public class Product {
 
	
	private int currentRate;
	private static int item=0;
	 public Product() {
		 
	 }
	
	public Product(int currentRate) {
		super();
		this.currentRate = currentRate;
	}
	
	public int getCurrentRate() {
		return currentRate;
	}
	
	public void setCurrentRate(int currentRate) {
		this.currentRate = currentRate;
	}
	

	
}
