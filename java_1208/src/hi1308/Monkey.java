package hi1308;

public class Monkey implements LivingThings{
	private String name;
	public Monkey()
	{
		
	}
	public Monkey(String name)

	{
		super();
		this.name=name;
    }
	
	public String getName()
	{
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void walk() {
		// TODO Auto-generated method stub
		System.out.println(getName()+" can also walk");
	}

}
