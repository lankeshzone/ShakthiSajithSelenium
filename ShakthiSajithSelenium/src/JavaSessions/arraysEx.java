package JavaSessions;

import java.util.Arrays;


public class arraysEx {

	public static void main(String[] args)
	{
	//single dimension array of type integer
		int[] a = new int[4];
		
		a[0]= 9;
		a[1]=10;
		
	
		
		System.out.println(Arrays.binarySearch(a, 10));
		
		//insertig default values
		//comparing two arrays
		// search particular element
		
		
		//used to print the arrayvalues
		for (int i=0; i<a.length;i++)
			System.out.println(a[i]);
		
		
		//two dimensional array of size 2*2
		
		int[][] x = new int[2][2];
		
		
		for (int i=0; i<2;i++)
			for (int j=0;j<2;j++)
				System.out.println(x[i][j]);
		
		
		//object type array ... arraysEX
		arraysEx[] arrayobj = new arraysEx[3];
		
		
		//objects of arraysEx
		arraysEx a1 = new arraysEx();
		arraysEx a2 = new arraysEx();
		arraysEx a3 = new arraysEx();
		
		
		//assigned object to object array
		arrayobj[0]=a1;
		arrayobj[1]=a2;
		arrayobj[2]=a3;
		
		//for printing object array
		for (int i=0; i<arrayobj.length;i++)
			System.out.println(arrayobj[i]);
		
		
		
	}

}
