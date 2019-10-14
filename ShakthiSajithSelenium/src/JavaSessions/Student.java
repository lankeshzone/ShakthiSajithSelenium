package JavaSessions;

public class Student
{
	int roll;  // instance members (object)
	String name; 
	String Dept;
	
	static String University = "Delhi University";
	
	
	public int calc_fee(int af, int tf)
	{
		int fee = af + tf;
		//System.out.println("Fees of the student " + fee);
		return fee;
	}
	
	
	public static void main(String[] args)
	{
		// creating objects of student class
		//classname objectname = new  <constructor>();
		Student sakthi = new Student();
		
		sakthi.roll = 1;
		sakthi.name = "Sakthi Y";
		sakthi.Dept = "AI";
		Student.University = "Delhi University";
		
		System.out.println("Student RollNumber " + sakthi.roll);
		System.out.println("Student Name " + sakthi.name);
		System.out.println("Student Dept " + sakthi.Dept);
		System.out.println("Student Fees " +  sakthi.calc_fee(1000,200));
		System.out.println("University " +  Student.University);
		
		Student sajith = new Student();
			
		sajith.roll = 2;
		sajith.name = "SaJith K Y";
		sajith.Dept = "DS";
		Student.University = "Bangalore University";
		
		System.out.println("Student RollNumber " + sajith.roll);
		System.out.println("Student Name " + sajith.name);
		System.out.println("Student Dept " + sajith.Dept);
		System.out.println("Student Fees " +  sajith.calc_fee(1230,230));
		System.out.println("University Name " +  Student.University);
		
		
	}

}
