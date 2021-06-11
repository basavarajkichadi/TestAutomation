package com.sgtesting.streamassignments;

import java.io.File;

public class SubFolder3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFolder();
	}
	static void createFolder()
	{
		String path = "E:\\sample";
		File dir = new File(path);
		String s[]=new String[10];

		for(int i=0;i<s.length;i++) 
		{

			String newName = "my_file_" + i ;
			String newPath = path + "\\" + newName;
			File f2=new File(newPath);
			boolean val=f2.mkdir();
			System.out.println(val);
		}
	}


}



