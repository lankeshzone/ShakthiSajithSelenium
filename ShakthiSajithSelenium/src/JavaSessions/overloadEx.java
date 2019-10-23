package JavaSessions;

public class overloadEx {

	public static void main(String[] args) 
	{
		overloadEx o = new overloadEx();
		o.methodOne();
		o.methodOne(100);
		o.methodOne(200, "Test");
		m1();
		m1(500);
	}

	
	public void methodOne()
	{
		System.out.println("Iam mehtodone without parameter");
	}
	
	public int methodOne(int x)
	{
		int y = 10;
		System.out.println("Iam mehtodone one parameter" + x);
		return y;
		
	}
	
	
	public void methodOne(int y, String str)
	{
		System.out.println("Iam mehtodone two parameter " + str);
	}
	
	
	public static void m1()
	{
		System.out.println("Iam static mehtod No parameter ");
	}
	
	public static void m1(int z)
	{
		System.out.println("Iam static mehtod one parameter " + z);
	}
}
