package hi1308;

public class Messaging {

	private String msg;
	
	private Messaging()
	{
		
	}
	private Messaging(String msg) {
	
		this.msg = msg;
	}


	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}
	
	public String toString()
	{
		return "Messaging(" +"message'"+msg+ '\''+')';
	
	}
	
	public static Messaging createMessagingObject() {
		
		if(msg==null)
		{
			msg=new Messaing();
		}
		return msg;
	}
	
	
	
}
