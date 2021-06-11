package com.sgtesting.classjava;
class demo3
{
	static void addition(int x,int y)
	{
		System.out.println(x+y);
	}
	static void multiplication(int x,int y)
	{
		addition(20,30);
		System.out.println(x*y);
	}
	
}

public class Staticdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo3.addition(25, 30);
		demo3.multiplication(55,5);

	}

}
