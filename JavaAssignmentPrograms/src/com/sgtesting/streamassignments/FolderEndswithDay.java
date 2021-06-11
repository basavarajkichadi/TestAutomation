package com.sgtesting.streamassignments;
import java.io.File;

public class FolderEndswithDay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		folderCollections();
	}
	static void folderCollections()
	{
		try
		{
			File f1=new File("E:\\SAMPLE\\weekday");
			String s[]=f1.list();
			for(int i=0;i<s.length;i++)
			{
				File f2=new File(f1,s[i]);
				if(f2.isDirectory()==true)
				{
					String foldername=f2.getAbsolutePath();
					if(! foldername.endsWith("day"))
					{
						f2.delete();
					}
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
