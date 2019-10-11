package JavaSessions;

public class classEx
{
	//data members
	static int roll; // member of the class nd defined at the class level
	String name;
	String dept;

	//main method --> written to start the execution of the program
	public static void main(String[] args) 
	{
		
		//x is a local variable with in main method
		int x; // scope of x is with in main method only
		
		int roll;
		
		roll = 300; // local variable roll
		
		classEx.roll = 400;
		
		System.out.println(" roll value " + classEx.roll);
		
		System.out.println("Hello");
		
		classEx c1 = new classEx();
		c1.roll = 100;
		c1.name = "sakthi";
		c1.dept = "AUI";
		
		x= 1000;
		
		System.out.println("Roll of the student" + c1.roll);
		System.out.println("Name of the student" + c1.name);
		System.out.println("Dept of the student" + c1.dept);
		c1.calcFee(100, 20000,3000);
		int balance = c1.check_Balance(1000, 200, 200);
		
		System.out.println("Balance is " + balance);
		
	}

	
	// calculate fee method
	public void calcFee(int tf, int sf, int af)
	{
		int x=1000;
		
		roll = 400; // class level roll valriable
		System.out.println("Roll value is " + roll);
		
		int fee = tf + sf +af;
		System.out.println("Fees of the student" + fee);
	}
	
	public int check_Balance(int prevBal, int Deposits, int Expenses)
	{
		int bal = prevBal + Deposits + Expenses;
		
		return bal;
	}
	
	
}

