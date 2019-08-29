package hi1308;

public class Test {
	 
	public static void main(String args[])
	{
		/*Flyer f=new Bird();
		f.takeoff();
		f=new Superman();
		f.takeoff();*/
		/*Model model=new Line(0,20);
		Model model1=new Line(0,10);
		Model model2=new Line(10,20);
		Model model3=new Line(10,30);
		Model model4=new Line(1,20);
		Model model5=new Line(10,10);
		
		System.out.println(model.isGreater(model1));
		System.out.println(model.isLesser(model2, model3));
		System.out.println(model.isEqual(model4, model5));*/
		//method overloading
		/*Messaging m= Messaging.createMessagingObject();
		System.out.println(m);
		Messsaging m1=Messaging.createMessagingObject();
		System.out.println(m==m1);*/
		
		/*ArrayDemo array=new ArrayDemo();
		array.createArray(26);
		char[] arr=array.getArray();
		for(char c:arr)
		{
			System.out.print(c+" ");
		}*/
		
		Stack_java stack = new Stack_java(5);
		stack.pop();
		stack.push(10);
		stack.push(30);
		stack.push(50);
		stack.push(40);
		stack.pop();
		stack.pop();
		stack.pop();
	}
}
