package Test;

public class modifierEx 
{

	public int a = 10;
	
	
	private int b = 20;
	
	
	int c = 30;
	
	protected int d = 40;
	
	
	public static void main(String[] args) 
	{
	
	modifierEx m = new modifierEx();
	
	System.out.println("Public is " + m.a);
	System.out.println("Private is " + m.b);
	System.out.println("Defailt is " + m.c);
	System.out.println("Protected is " + m.d);
		
		
	}

}
