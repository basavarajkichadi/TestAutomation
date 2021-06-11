package com.sgtesting.streamassignments;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;

public class Countlines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readContent();
	}
	static void readContent()
	{
		BufferedReader b=null;
		String str="";
		int count=0,count1=0,count2=0;
		
		try
		{
			FileReader f=new FileReader("E:\\\\sample\\\\weekday\\\\King\\\\Test.txt");
			b=new BufferedReader(f);
			LineNumberReader l=new LineNumberReader(new InputStreamReader(new FileInputStream("E:\\sample\\weekday\\King\\Test.txt")));
			while(((str=l.readLine())!=null))
			{
				count++;
				count1+=str.length();
				String[] s=str.split("\\s+");
				count2+=s.length;	
			}
			System.out.println("number of lines "+count);
			System.out.println("numer of letters "+count1);
			System.out.println("number of words "+count2);



		}catch(Exception e)
		{
			e.printStackTrace();
		}


	}

}
