package JavaSessions;

public class stringsEx {

	public static void main(String[] args) 
	{
	
		String str1 = new String("Hello");
		
		
		System.out.println(str1.charAt(4)); // returns the charat at the specified index
		
		System.out.println(str1.concat("India")); // joins two strings without modifying the original string
		
		System.out.println(str1);
		
		System.out.println(str1.contains("llo")); //return true or false based on the contains result
		
		System.out.println(str1.equals("Lankesh")); //returns true/false based on the comparison of two string objects
		
		System.out.println(str1.endsWith("o")); //returns true or false based on the endwith value.
		
		System.out.println(str1.indexOf('l'));//returns the first occurence of the character index
		
		System.out.println(str1.isEmpty()); //returns if string is empty or not
		
		System.out.println(str1.length()); // returns lengthof the string
		
		System.out.println(str1.replace('l', 'n'));
		
		System.out.println(str1);
		
		System.out.println(str1.startsWith("H"));
		
		System.out.println(str1.substring(2)); //returns substring starting from the index specified...
		
		System.out.println(str1.toLowerCase());
		
		System.out.println(str1.toUpperCase());
		
		
		String[] s = str1.split("e");
		for(int i=0;i<s.length;i++)
		System.out.print(s[i]);
		
		
		System.out.println();
		
		StringBuffer str2 = new StringBuffer("India"); //THread safety uti-thread
		
		str2.append(",Bangalore");
		
		System.out.println(str2);
		
		System.out.println(str2.charAt(3));
		System.out.println(str2.length());
		System.out.println(str2.substring(3));
		str2.delete(1, 3);
		System.out.println(str2);
		System.out.println(str2.insert(2, "hello"));
		System.out.println(str2.replace(3, 5, "test"));
		
		
		StringBuilder str3 = new StringBuilder("America"); //Performance oriented use
		str3.append("island");
		
		System.out.println(str3);
		
		
		
	}

}
