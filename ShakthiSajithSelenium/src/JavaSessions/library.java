package JavaSessions;

abstract public class library extends studentAbstract
{

	public static void main(String[] args) 
	{
		
	//	library l1 = new library();
		//l1.fetchbook();
		
		System.out.println("Iam main method in child class");
	}

	public void fetchbook()
	{
		System.out.println("Iam fetchbook method implemented in child class");
	}
	
}

