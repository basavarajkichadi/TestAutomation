package characterstream;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class FileReaderDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//filreader();
		filewrite();
	}
	static void filreader()
	{
		FileReader fr=null;
		File file=null;
		try
		{
			file=new File("E:\\File\\Example.txt");
			fr=new FileReader(file);
			char ch[]=new char[(int) file.length()];
			fr.read(ch);
			System.out.println(Arrays.toString(ch));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	static void filewrite()
	{
		FileWriter ft=null;
		File file=null;
		try
		{
			file=new File("E:\\File\\Example.txt");
			ft=new FileWriter(file);
			ft.write('a');
			ft.write("\n Hello");
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				ft=null;
				ft.flush();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	
	

}
