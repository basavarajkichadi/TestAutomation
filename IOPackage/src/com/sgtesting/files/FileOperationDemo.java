package com.sgtesting.files;

import java.io.File;

public class FileOperationDemo {

	public static void main(String[] args) {
		//createFile();
		//renamaeFile();
		// moveFile();
		//deleteFile();
		//fileAttributes();
		fileCollection1();
		//fileCollection2();
	}

	static void createFile()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\File\\Sample.txt");
			boolean val=f1.createNewFile();
			if(val==true) System.out.println("File Created ");
			else System.out.println("File Exist Or File not created");

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1=null;
		}
	}

	static void renamaeFile()
	{ 
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\File\\sample.txt");
			f2=new File("E:\\File\\Example.txt");
			f1.renameTo(f2);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1=null;
			f2=null;
		}
	}

	static void moveFile()
	{	
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\File\\Example.txt");
			f2=new File("E:\\File\\temp\\Example.txt");
			f1.renameTo(f2);

		}catch(Exception e)
		{
			System.out.println(e);
		}
	}

	static void deleteFile()
	{
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\File\\sample.txt");
			f2=new File("E:\\File\\Example.txt");
			boolean val=f1.delete();
			if(val==true)System.out.println("File Deleted Succcessfully");
			else System.out.println("Unable to delete the File");
			f2.deleteOnExit();
		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;
			f2=null;
		}
	}

	static void fileAttributes()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\File\\sample.txt");
			System.out.println("File name is: "+f1.getName());
			System.out.println("Parent name is: "+f1.getParent());
			System.out.println("File path is:  "+f1.getPath());
			System.out.println("getTotalSpace: " + f1.getTotalSpace());
			System.out.println("getUsableSpace: " + f1.getUsableSpace());
			System.out.println("lastModified: " + f1.lastModified());
			System.out.println("canExecute: " + f1.canExecute());
			System.out.println("canRead: " + f1.canRead());
			System.out.println("canWrite: " + f1.canWrite());
			System.out.println("isDirectory: " + f1.isDirectory());
			System.out.println("isFile: " + f1.isFile());
			System.out.println("isHidden: " + f1.isHidden());
			System.out.println("length: " + f1.length());
			System.out.println("exists: " + f1.exists());
			System.out.println("setReadable: " + f1.setReadable(true));
			System.out.println("setWritable: " + f1.setWritable(true));
			System.out.println("setReadOnly: " + f1.setReadOnly());

		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally
		{
			f1=null;
		}
	}

	static void fileCollection1()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\File");
			File objfile[]=f1.listFiles();
			for(int i=0;i<objfile.length;i++)
			{
				if(objfile[i].isFile())
				{
					System.out.println(objfile[i].getPath());
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1=null;
		}
	}

	static void fileCollection2()
	{
		File f1=null;
		File f2=null;
		try
		{
			int count=0;
			int rarcount=0;
			int doccount=0;
			f1=new File("E:\\File");
			String files[]=f1.list();
			for(int i=0;i<files.length;i++)
			{
				f2=new File(f1,files[i]);
				if(f2.isFile())
				{
					System.out.println(f2.getPath());
					if(f2.getPath().contains(".txt"))
					{
						count++;
					}
					if(f2.getPath().contains(".rar"))
					{
						rarcount++;
					}
					if(f2.getPath().contains(".docx"))
					{
						doccount++;
					}

				}
			}
			System.out.println("The Number Of txt Files are:  "+count);
			System.out.println("The Number Of rar Files are:  "+rarcount);
			System.out.println("The Number Of doc Files are:  "+doccount);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1=null;
			f2=null;
		}
	}

}
