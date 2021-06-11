package com.sgtesting.files;

import java.io.File;

public class DirectoryOperation {

	public static void main(String[] args) {
		//createFolder();
		//renameFolder();
		//renameFolder();
		//deleteFolder();
		//folderAttributes();
		//folderCollection();
		//dirCollection1();
		 folderCollection1();
	}
	static void createFolder()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\Programming");
			boolean val=f1.mkdir();
			if(val==true)System.out.println("Folder Created Successfully");
			else System.out.println("Can't create Folder");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1=null;
		}
	}

	static void renameFolder()
	{
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\kichadi");
			f2=new File("E:\\File\\kichadi");
			if(f1.renameTo(f2)==true)System.out.println("Folder moved Succcessfully");
			else System.out.println("Can't move the Folder");

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
	static void moveFolder()
	{
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\Programming");
			f2=new File("E:\\pythonProgramming");
			if(f1.renameTo(f2)==true)System.out.println("Folder Renamed Succcessfully");
			else System.out.println("Can't rename the Folder");

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
	static void deleteFolder()
	{
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\File\\kichadi");
			f2=new File("E:\\Sample");
			if(f1.delete()==true) System.out.println("Folder Deleted");
			else System.out.println("Folder  not Deleted");
			f2.deleteOnExit();
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
	static void folderAttributes()
	{
		File f1=null;
		try
		{
			f1=new File("E:\\Testing");
			System.out.println(f1.getName());
			System.out.println(f1.getParent());
			System.out.println(f1.getPath());
			System.out.println(f1.isFile());
			System.out.println(f1.isDirectory());
			System.out.println(f1.canRead());
			System.out.println(f1.canExecute());
			System.out.println(f1.isHidden());
			System.out.println(f1.canWrite());

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			f1=null;
		}
	}
	static void folderCollection()
	{
		File f1=null;
		File f2=null;
		try
		{
			f1=new File("E:\\File");
			String file[]=f1.list();
			for(int i=0;i<file.length;i++)
			{
				f2=new File(f1,file[i]);
				if(f2.isDirectory())
				{
					System.out.println(f2.getPath());
				}
			}
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

	static void dirCollection1()
	{
		File f1 = null;
		File f2 = null;
		try {
			f1 = new File("E:\\File");
			String sFiles[] = f1.list();

			for(int i=0; i<sFiles.length; i++) {

				f2 = new File(f1 +"\\"+ sFiles[i]);

				if(f2.isDirectory()) {
					System.out.println(f2.getPath());
				}
			}

		}catch(Exception e)
		{
			System.out.println(e);
		}
		finally {
			f1 = null;
			f2 = null;
		}
	}
	static void folderCollection1()
	{
		File f1=null;
		
		try
		{
			f1=new File("E:\\File");
			File obj[]=f1.listFiles();
			for(int i=0;i<obj.length;i++)
			{
				
				if(obj[i].isDirectory())
				{
					System.out.println(obj[i].getPath());
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
}

