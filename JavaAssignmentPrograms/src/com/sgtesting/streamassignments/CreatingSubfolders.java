package com.sgtesting.streamassignments;

import java.io.File;

public class CreatingSubfolders {

	public static void main(String[] args) {
		subFolder();

	}
	static void subFolder()
	{
		File f1=new File("E:\\Example\\State");
		boolean val1=f1.mkdirs();
		System.out.println("Folder Created Successfully: "+val1);
		
		File f2=new File("E:\\Example\\District");
		boolean val2=f2.mkdir();
		System.out.println("Folder Created Successfully: "+val2);
		
		File f3=new File("E:\\Example\\Village");
		boolean val3=f3.mkdir();
		System.out.println("Folder Created Successfully: "+val3);
		
		File f4=new File("E:\\Example\\Taluk");
		boolean val4=f4.mkdir();
		System.out.println("Folder Created Successfully: "+val4);
		
		File f5=new File("E:\\Example\\Hobli");
		boolean val5=f5.mkdir();
		System.out.println("Folder Created Successfully: "+val5);
		
		File f6=new File("E:\\Example\\GramPanchayat");
		boolean val6=f6.mkdir();
		System.out.println("Folder Created Successfully: "+val6);
		
		File f7=new File("E:\\Example\\District Panchayat");
		boolean val7=f7.mkdir();
		System.out.println("Folder Created Successfully: "+val7);
		
		File f8=new File("E:\\Example\\Taluk Panchayat");
		boolean val8=f8.mkdir();
		System.out.println("Folder Created Successfully: "+val8);
		
		File f9=new File("E:\\Example\\Area");
		boolean val9=f9.mkdir();
		System.out.println("Folder Created Successfully: "+val9);
		
		File f10=new File("E:\\Example\\Hello");
		boolean val10=f10.mkdir();
		System.out.println("Folder Created Successfully: "+val10);
	}

}
