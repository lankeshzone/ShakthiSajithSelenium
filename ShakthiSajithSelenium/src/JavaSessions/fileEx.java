package JavaSessions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.lang.

public class fileEx 
{

	public static void main(String[] args) throws IOException
	{

		File file = new File("D://Test//test1.txt");
		
		if(file.exists())
			System.out.println("File already exists");
		else
			file.createNewFile();
		
	/*	FileWriter fw = new FileWriter(file);
		char c ='a';
		
		fw.write(c);
		String str ="This is my writing info";
		
		fw.write(str);
		fw.flush();
		
		fw.close();

		FileReader fr = new FileReader(file);
		
		char[] ch = new char[100];
		
		fr.read(ch);
		
		for(int x=0; x<ch.length;x++)
			System.out.print(ch[x]);*/
		
		
		
		
		
		String s = "This is my data";
		
		byte[] bb = s.getBytes();
		
		FileOutputStream fos = new FileOutputStream(file);
		
		
		fos.write(bb);
		
		
		fos.flush();
		

		FileInputStream fis = new FileInputStream(file);
		
		byte[] b = fis.readAllBytes();
		
		for(int x=0;x<b.length;x++)
		System.out.print((char)b[x]);
		
		
		
	}

}
