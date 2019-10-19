package JavaSessions;

import Test.modifierEx;

public class differentPackage {

	public static void main(String[] args) 
	{
	
		modifierEx m = new modifierEx();
		
		System.out.println("Public is " + m.a);
	
		
		//System.out.println("Private is " + m.b); is private so cannot accesed
		
	//	System.out.println("Defailt is " + m.c);
	//	System.out.println("Protected is " + m.d);
		
	}

}
