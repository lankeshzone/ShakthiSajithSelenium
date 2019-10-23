package JavaSessions;

public final class childOne extends Parent
{

	public static void main(String[] args) 
	{
		childOne c1 = new childOne();
		c1.superParentmethod();
		c1.parentMethod();
		c1.childOnemethod();
	}
	
	public void childOnemethod()
	{
		
	System.out.println("Iam method in childOne class");
	}
}
