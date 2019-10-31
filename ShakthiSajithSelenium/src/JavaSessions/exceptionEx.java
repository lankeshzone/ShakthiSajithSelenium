package JavaSessions;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.MalformedInputException;



public class exceptionEx {

	public static void main(String[] args) throws MalformedURLException, IOException
	{
	
		int num1 = 10;
		int num2 = 2 ;
		
		int div;
		
		
		URL u = new URL("https://drhgjdfhk.com");
		
		
		try
		{
			
		div = num1/num2;
		System.out.println("Divide value is  " + div);
		
		}
		catch(ArithmeticException d)
		{
			
			num2 = 1;
			div = num1 / num2;
			System.out.println("Exception message is " + d.getMessage());
		
		}
		finally
		{
			System.out.println("I will execute irrespective of try or catch execution");
			
		}
		
		
		
		
		
		int[] a = new int[3];
		
		try
		{
			a[0]= 10;
			a[1]= 10;
			
			if(a[1] == 20)
				throw new IOException("value is 20 I do not want to proceed");
			
			a[2] = 30;
			a[3] = 40;
		}
		catch(IndexOutOfBoundsException b)
		{
			System.out.println(b.getMessage());
		}
		
		
		File f = new File("D://test//asohgfodsh.txt");
		
		f.delete();
	
		
		System.out.println("Continuation of program");
		
	}

}
