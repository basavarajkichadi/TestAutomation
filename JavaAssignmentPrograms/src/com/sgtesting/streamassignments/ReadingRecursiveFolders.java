package com.sgtesting.streamassignments;

import java.io.File;
import java.io.FileReader;

public class ReadingRecursiveFolders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		filesCollection();

	}

	static void filesCollection()
	{
		try
		{
			File f=new File("E:\\Example");
			String s[]=f.list();
			for(int i=0;i<s.length;i++)
			{
				File f1=new File(f,s[i]);
				if(f1.mkdir()==true) 
				{
					String fo=f1.getAbsolutePath();
					System.out.println(fo);	
				}

			}

		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}
}
