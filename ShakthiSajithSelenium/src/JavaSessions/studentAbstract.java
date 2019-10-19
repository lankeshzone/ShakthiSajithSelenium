package JavaSessions;

abstract public class studentAbstract 
{
	int roll;
	String name;

	public static void main(String[] args)
	{
		//studentAbstract saksthi = new studentAbstract();
		
		studentAbstract.m1();
		System.out.println("Iam main method in abstract class");
	}

	//normal method
	public void calcfee(int tf, int sf, int af)
	{
		int fee = tf + sf + af;
		System.out.println("Fee is " + fee);
	}
	
	//static method
	public static void m1()
	{
		System.out.println("Iam a static method");
	}
	
	//abstract methods
	abstract public void fetchbook();
	
	abstract public int m2(int x);
	

}
