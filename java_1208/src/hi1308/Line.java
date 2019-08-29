package hi1308;

public class Line extends Model{
 
		private int startPoint;
	private int endPoint;
	
	public Line()
	{
		
	}
	
	public Line(int startPoint, int endPoint) {
		super();
		this.startPoint = startPoint;
		this.endPoint = endPoint;
	}
	
	public int getStartPoint() {
		return startPoint;
	}


	public void setStartPoint(int startPoint) {
		this.startPoint = startPoint;
	}


	public int getEndPoint() {
		return endPoint;
	}


	public void setEndPoint(int endPoint) {
		this.endPoint = endPoint;
	}
	
	public int claculateLength()
	{
		return getEndPoint()-getStartPoint();
	}


	@Override
	public boolean isGreater(Object obj1) {
		// TODO Auto-generated method stub
		
		Line l1=(Line)obj1;
		return l1.claculateLength()>this.claculateLength();
	}

	@Override
	public boolean isLesser(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		return l1.claculateLength()<l2.claculateLength();
		
	}

	@Override
	public boolean isEqual(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Line l1=(Line)obj1;
		Line l2=(Line)obj2;
		return l1.claculateLength()==l2.claculateLength();
	}


	
}
