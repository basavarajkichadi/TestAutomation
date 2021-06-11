package com.sgtesting.streamassignments;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Nestedfolder2 {

	public static void main(String[] args) {
	
		createNestedFolder();
	}
	
	static void createNestedFolder()
	{
		//File f=new File("E:\\sample1\\demo1\\dd1\\dd2\\dd3\\dd4\\dd5\\dd6\\dd7");
		Path path=Paths.get("E:\\sample1\\demo1\\dd1\\dd2\\dd3\\dd4\\dd5\\dd6\\dd7");
		try 
		{
			Files.createDirectories(path);
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
