package stringdemo;

import java.util.Arrays;

public class SplitDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		splitDemo();
	}
	static void splitDemo()
	{
		String str="Welcome to sg";
	String array[]=	str.split(" ");
	System.out.println(Arrays.toString(array));
	}

}
