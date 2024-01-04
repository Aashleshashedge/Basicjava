package MyPack;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;



public class FileHandle {

	public static void main(String[] args) {
		
		File objinf = new File ("C:\\Users\\admin\\eclipse-workspace\\Fjp\\src\\A.txt");
		File objout = new File ("C:\\Users\\admin\\eclipse-workspace\\Fjp\\src\\B.txt");
		
		FileReader ins = null;
		FileWriter outs = null;
		
		
		try
		{
			ins = new FileReader(objinf);
			outs = new FileWriter(objout);
			int ch;
			
			
			while((ch=ins.read())!=-1)
			{
				outs.write(ch);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
			System.exit(-1);
		}
		finally
		{
			try
			{
				ins.close();
				outs.close();
			}
			catch(IOException e){}
		}
		
		
		
		System.out.println("Filed Copied");

	}
}
