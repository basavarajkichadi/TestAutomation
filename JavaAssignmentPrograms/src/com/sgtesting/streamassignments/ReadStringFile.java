package com.sgtesting.streamassignments;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class ReadStringFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readContent();
	}
	static void readContent()
	{
		BufferedReader b=null;
		String str="";
		String val="acc no 10022333445556777";
		try
		{
			b=new BufferedReader(new FileReader("E:\\sample\\weekday\\money\\bank.txt"));
			LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\money\\bank.txt")));

			while((str=l.readLine())!=null)
			{
				if(str.equals(val))
				{
					System.out.println(str);
				}
			}

			l.close();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
