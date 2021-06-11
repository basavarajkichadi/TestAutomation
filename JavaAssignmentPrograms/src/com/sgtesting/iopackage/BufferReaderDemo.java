package com.sgtesting.iopackage;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferReaderDemo {
	public static void main(String[] args)
	{
		readContent();
	}
	static void readContent()
	{
		BufferedReader bfr=null;
		try
		{
			bfr=new BufferedReader(new FileReader("E:\\Example\\Village\\Home.txt"));
			String strLine=null;

			while((strLine=bfr.readLine())!=null)
			{
				System.out.println(strLine);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				bfr.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
