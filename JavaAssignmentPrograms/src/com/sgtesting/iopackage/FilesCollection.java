package com.sgtesting.iopackage;

import java.io.File;

public class FilesCollection {
	public static void main(String[] args) {
		fileCollections();
	}
	static void fileCollections()
	{
		try
		{
			File f1=new File("E:\\Example\\village");
			File[] f2=f1.listFiles();
			for(int i=0;i<f2.length;i++)
			{
				if(f2[i].isFile()==true)
				{
					String name=f2[i].getAbsolutePath();
					System.out.println(name);
				}
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
