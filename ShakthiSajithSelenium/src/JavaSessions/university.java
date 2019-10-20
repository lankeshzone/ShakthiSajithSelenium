package JavaSessions;



public interface university
{

	//abstract methods without using the eyword
	public void calcfee(int af, int tf, int sf);
	
	//abstract method with keyword
	public abstract void fetchbook(); 
	
	
	//method
	public static void m1()
	{
		System.out.println("Hello this is static method");
	}
	
	public static void main(String[] args)
	{
		m1();
//		university u1 = new university();
	}
	
	
}
