package com.sgtesting.streamassignments;

import java.io.File;

public class ReadingDeleteFolder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		renameFile();
		deleteFile();
	}
	static void renameFile()
	{
		String path = "E:\\sample\\weekday\\Basu";
		File dir = new File(path);
		File[] filesInDir = dir.listFiles();
		int i = 0;
		for(File file:filesInDir) 
		{
			i++;

			String name = file.getName();
			if(name.endsWith(".txt"))
			{
				String newName = "my_file_" + i + ".txt";
				String newPath = path + "\\" + newName;
				file.renameTo(new File(newPath));
				System.out.println(name + " changed to " + newName);
			}
		}


	}

	static void deleteFile()
	{
		String path = "E:\\sample\\weekday\\Basu";
		File dir = new File(path);
		File[] filesInDir = dir.listFiles();

		for(File file:filesInDir) 
		{


			String name = file.getName();
			try
			{
				if(name.endsWith(".xlsx"))
				{
					file.deleteOnExit();
				}	
			}catch(Exception e)
			{
				e.printStackTrace();
			}

		}
	}
}