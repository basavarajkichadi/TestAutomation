package com.sgtesting.files;

import java.io.File;
import java.util.Arrays;

public class FileOperation {

	public static void main(String[] args) {
		//createfile();
		//deletefile();
		//attributes();
		//filescollection();
		filescollection1();
	}

	//
	static void createfile()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\file\\Example.txt");
			boolean bool=f1.createNewFile();
			if(bool==true) {System.out.println("File created");}
			else {System.out.println("File not created");}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;
		}
	}

	static void  deletefile()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\file\\Example.txt");
			boolean bool=f1.delete();
			if(bool==true) {System.out.println("File deleted");}
			else {System.out.println("File not deleted");}
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;
		}
	}
	static void attributes()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\file\\Example.txt");
			System.out.println("path"+f1.getPath());
			System.out.println("Name of the file"+f1.getName());
			System.out.println("Absolute path"+f1.getAbsolutePath());
			System.out.println("is file : "+f1.isFile());
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;
		}
	}

	static void filescollection()
	{

		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\file");
			String sfiles[]=f1.list();
			System.out.println(Arrays.toString(sfiles));
			for(int i=0;i<sfiles.length;i++)
			{
				f2=new File(f1,sfiles[i]);
				if(f2.isFile())
				{
					System.out.println(f2.getAbsolutePath());
				}
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;f2=null;
		}
	}

	static void filescollection1()
	{

		File f1=null;
		File f2=null;
		int count=0;
		try
		{
			f1=new File("E:\\file");
			File obj[]=f1.listFiles();
			for(int i=0;i<obj.length;i++)
			{
				if(obj[i].isFile())
				{
					System.out.println(obj[i].getPath());
					if(obj[i].getPath().contains(".txt"));
					{
						count++;
					}
				}		
			}
			System.out.println("text files are "+count);
			

		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;f2=null;
		}
	}
}

