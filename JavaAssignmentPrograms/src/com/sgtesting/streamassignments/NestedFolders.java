package com.sgtesting.streamassignments;

import java.io.File;

public class NestedFolders {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		nestedFolders();

	}
	static void nestedFolders()
	{
		File file=new File("E:\\Sample\\Demo\\dd1\\dd2\\dd3\\dd4\\dd5\\d6\\dd7");
		boolean val=file.mkdirs();
		System.out.println(" Nested Folders Created Successfully"+val);
	}

}
