package hi1308;

public class Dog{
	

	private String breed;
	private String name;
	
	public Dog()
	{
		
	}
	

	public Dog(String name,String breed) {
		super();
		this.name=name;
		this.breed = breed;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	


	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	} 
    
	public void createLivingThings() {
		
		LivingThings living=new LivingThings()
		{
			public void walk() {
				
				System.out.println("Dog Name: "+getName()+" Dog Breed:"+getBreed()+" can also walk");
			}
		};
		living.walk();
	}
		
	

	
}
