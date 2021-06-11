package com.sgtesting.classjava;

public class Staticdemo2 {
	static void addition(int x,int y)
	{
		System.out.println((x+y));
	}
	static void multiplication(int x,int y)
	{
		System.out.println(x*y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		addition(20,30);
		multiplication(20,30);
		
		System.out.println("************");
		addition(20,30);
		multiplication(20,30);

	}

}
