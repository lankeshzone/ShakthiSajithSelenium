package JavaSessions;

public class typecastEx 
{
	
	static int a = 10;
	int b = 20;

	public void main(String args, int x) 
	{
	
		int y = 100;
		
		byte b = 30;
		
		
		//implicit type casting
		
		//x = b; // compiler takes care of implicit type cast
		
		//explicit type casting
		
		b = (byte)y;
		
		System.out.println(" iam inside method one");
	}
	
	public static void main(String[] a)
	{
		System.out.println("Hello iam static main");
		typecastEx ts = new typecastEx();
	//	ts.main("Hello", 100);
		
	}

	//block is a piece of code enclosed in {}
	//static block
	static
	{
		System.out.println("Iam a static block one");
	}
	
	static
	{
		System.out.println("Iam second static block");
	}

	//instance block
	{
		System.out.println("Iam first instance block");
	}
	
	{
		System.out.println("Iam Second instance block");
			
	}
	
	
	typecastEx()
	{
		System.out.println("Iam a constructor");
	}
}
	




