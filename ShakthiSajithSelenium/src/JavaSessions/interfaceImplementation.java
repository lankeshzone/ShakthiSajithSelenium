package JavaSessions;

public class interfaceImplementation extends studentAbstract implements university, intTwo  
{

	public static void main(String[] args)
	{
		interfaceImplementation i1 = new interfaceImplementation();
		i1.calcfee(100, 20,300);
		i1.fetchbook();
	}
	
	public void calcfee(int tf, int sf, int af)
	{
		int fee = sf+tf+af;
		System.out.println("Student fee " + fee);
	}

	
	public void fetchbook()
	{
		System.out.println("Reserve book for stuent");
	}
	
	public void m3()
	{
		System.out.println("interface two method");	
	}

	@Override
	public int m2(int x) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
