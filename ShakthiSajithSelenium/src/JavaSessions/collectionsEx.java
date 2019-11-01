package JavaSessions;

import java.util.ArrayList;
import java.util.HashSet;

public class collectionsEx {

	public static void main(String[] args) 
	{
		
		
	
		ArrayList<Integer> a = new ArrayList<Integer>();
		
		a.add(100);
		a.add(400);
		a.add(12);
		a.add(34);
		a.add(400);
		
		System.out.println(a.contains(56));
		
		System.out.println(a);
		
		ArrayList<Comparable> b = new ArrayList<Comparable>();
		
		b.add(100);
		b.add('t');
		b.add(false);
		
		System.out.println(b);
		
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(100);
		hs.add(100);
		hs.add(23);
		
		System.out.println(hs);
		
	}

}
