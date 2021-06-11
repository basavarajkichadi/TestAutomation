package com.sgtesting.streamclass;

import java.io.FileInputStream;

public class ByteStreamDemo {

	public static void main(String[] args) {
		readFile();
	}
	static void readFile()
	{
		FileInputStream fin=null;
		try
		{
			int output=0;
			fin=new FileInputStream("E:\\File\\Example.txt");
			while(true)
			{
				output=fin.read();
				if(output==-1)
				{
					break;
				}
				System.out.print(output);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fin=null;
				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
