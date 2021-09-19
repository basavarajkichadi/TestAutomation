package streamclasses;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferReadreDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//readfiledemo();
		writeToFile();
	}
	static void readfiledemo()
	{
		BufferedReader bfr=null;
		try
		{
			bfr=new BufferedReader(new FileReader("E:\\file\\test.txt"));
			
			String line;
			while(true)
			{
				line=bfr.readLine();
				if(line==null) break;
				System.out.println(line);
			}
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
	
	static void writeToFile()
	{
		BufferedWriter bw = null;
		try{
			bw = new BufferedWriter(new FileWriter("E:\\file\\aaaa.txt", false));
			
			bw.write(65);
			bw.newLine();
			bw.write('G');
			bw.newLine();
			bw.write("Welcome to SG Testing Institute");
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			try{
				bw.flush();
				bw.close();
				bw = null;
			}catch(Exception e)
			{
				System.out.println(e);
			}
		}
	}
}


