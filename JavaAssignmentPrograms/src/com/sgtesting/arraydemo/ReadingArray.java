package com.sgtesting.arraydemo;

import java.util.Arrays;

public class ReadingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{2,3}};
		int b[]= {1,2,3};
		String c[]= {"b","c"};
		String str[][]= {{"basu","akil"},{"akil","jeevan"}};
		System.out.println(Arrays.asList(c));
		System.out.println();
	//	System.out.println(Arrays.asList(b));
		System.out.println();
		System.out.println(Arrays.toString(b));
		System.out.println();
		System.out.println(Arrays.deepToString(a));
		System.out.println();
		System.out.println(Arrays.deepToString(str));

	}

}
