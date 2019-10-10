package JavaSessions;


public class variablesConstantsEx 
{
	static short s;
	
	static byte b;
	
	static char c = 'L';  //"\0"
	
	static boolean bl; //false
	
	static long l;
	
	static double d;
	
	static float f;

	
	//constants - final
	
	//final <datatype> constantname = value;
	
	static final float pi = 3.14f;
	
	
	public static void main(String[] args) 
	{
	
		//syntax for creating variables
		//<data type> <name>;
		
		
		
		int balance = 100;
		
		// initializing  ... executing
		
		System.out.println("this is integer data type : " + balance);

		System.out.println("this is short data type : " + s);
		
		System.out.println("this is character data type : " + c);	
		
		System.out.println("this is Constant data type : " + pi);	
		
	}

}
