package hello_1208;

public class MyNewDate {
	
	private int day;
	private int month;
	private int year;
	
	public void createDate(int d, int m, int y)
	{
		
		if(d>30)
		{
			System.out.println("Day can't be greater than 30");
			System.exit(0);//status 0 - stop thread , 1 - thread will be running
		}
		
		if(m>13)
		{
			System.out.println("Month can't be greater than 12");
			System.exit(0);//status 0 - stop thread , 1 - thread will be running
		}
		
		if(y<1500 && y>2019)
		{
			System.out.println("Wrong year");
			System.exit(0);//status 0 - stop thread , 1 - thread will be running
		}
	

	day=d;
	month=m;
	year=y;
	}

	public int getDate()
	{
		return day;
	}
	
	public int getMonth()
	{
		return month;
	}
	
	public int getYear()
	{
		return year;
	}
	
	public boolean setDate()
	{
		if(day<=30)
		{
			return true;		
		}
		else
			return false;
	}
	
	public boolean setMonth()
	{
		if(month<=12)
		{
			return true;		
		}
		else
			return false;
	}
}	
