package JavaSessions;

public class override extends overloadEx
{

	public static void main(String[] args) 
	{
		//childobject == child reference
		
		//classname objectname = new constroctur();
		//object type = reference type
		
		override o1;
		o1 = new override();
		
		
		
		
		o1.methodOne(); //child class method is executing
		
		//parent object == parent reference
		overloadEx o2 ;
		
		o2 = new overloadEx(); //parent reference
		
		o2 = o1; //child reference
		
		
		
		
		o2.methodOne(); //parent class method
		
		
		
		
		//parentobject == child reference
		overloadEx o3 = new override();
		o3.methodOne(); //child class method
		
		
		//child object === parent reference
		try
		{
		override o4 = (override) new overloadEx();
		o4.methodOne();
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	
	
	public void methodOne()
	{
		System.out.println("Iam mehtodone without parameter in child class");
	}

}
