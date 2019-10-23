package JavaSessions;

public class Parent extends SuperParent
{

	public static void main(String[] args)
	{
		Parent p = new Parent();
		p.superParentmethod();
		p.parentMethod();
	}

	public void parentMethod()
	{
		System.out.println("Iam method in parent class");
	}
	
	
}

