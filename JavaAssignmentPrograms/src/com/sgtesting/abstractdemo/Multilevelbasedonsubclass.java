package com.sgtesting.abstractdemo;
abstract class Test
{
	abstract void addition(int x,int y);
	abstract void substraction(int x,int y);
	void showNumbers(int Number[])
	{
		System.out.println("The Numbers Between 1 to 5 Are ");
		for(int i=0;i<Number.length;i++)
		{
			System.out.println(Number[i]);
		}
	}
}
class Test1 extends Test
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result in First Subclass: "+(x+y));
	}
	void substraction(int x,int y)
	{
		System.out.println("substraction Result in First Subclass "+(x-y));
	}
	void multiplication(int x,int y)
	{
		System.out.println("Multiplication Result in First Subclass: "+(x*y));
	}
}
class Test2 extends Test1
{
	
}

public class Multilevelbasedonsubclass {

	public static void main(String[] args) {
		Test2 obj=new Test2();
		obj.addition(20, 30);
		obj.substraction(30, 10);
		obj.multiplication(10,20);
		int N[]= {10,20,30,40,50};
		obj.showNumbers(N);
		

	}

}
