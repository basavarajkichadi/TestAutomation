package com.sgtesting.iopackage;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Folderoperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createFolder();
		createNestedFolder();
		renameFolder();
	}
	static void createFolder()
	{
		File f1=new File("E:\\JavaProgramming\\");
		boolean val1=f1.mkdirs();
		System.out.println("Folder Created Successfully: "+val1);

	}
	static void createNestedFolder()
	{
		File f=new File("E:\\AAA\\BB\\CC\\DD\\EE\\FF");
		boolean val=f.mkdirs();
		System.out.println("nested folder created "+val);
	}
	
	static void renameFolder()
	{
		File f=new File("E:\\AAA\\AA");
		File f1=new File("E:\\AAA\\new");
		boolean val=f.renameTo(f1);
		System.out.println("folder is renamed "+val);
	}
	static void deleteFolder()
	{
		File f1=new File("E:\\AAA\\new");
		boolean val=f1.delete();
		System.out.println("the folder is deleted "+val);
	}
}
