package com.sgtesting.streamassignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadingandWritingReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		writeContnet();
	}
	static void writeContnet()
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		try
		{
			String str[]=new String[10];
			br=new BufferedReader(new FileReader("E:\\Sample\\Demo1\\Test.txt"));
			String strLine=null;
			int k=0;
			while((strLine=br.readLine())!=null)
			{
				str[k]=strLine;
				k+=1;
			}
			
			bw=new BufferedWriter(new FileWriter("E:\\Sample\\Demo1\\Test1.txt",true));
			for(int i=str.length-1;i>=0;i--)
			{
				bw.write(str[i]);
				bw.newLine();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				br.close();
				bw.flush();
				bw.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
