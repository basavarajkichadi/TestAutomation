package com.sgtesting.exception;
class BasicMaths
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}

	void substraction(int x,int y)
	{
		System.out.println("Substraction Result :"+(x-y));
	}

	void division(int x,int y)
	{
		int Res=x/y;
		System.out.println("Division Result :"+Res);
	}
	void multiplication(int x,int y)
	{
		int Res=(x*y);
		System.out.println("Multiplication Result :"+Res);
	}
	void modResult(int x,int y)
	{
		System.out.println("Modulus Result :"+(x%y));
	}
	void verifyEvenNumber(int n)
	{
		if(n%2==0)
		{
			System.out.println(n + " is a Even Number");
		}
	}
	void verifyOddNumber(int n)
	{
		if(n%2==1)
		{
			System.out.println(n + " is a Odd Number");
		}
	}
	void isPositiveNumber(int num)
	{
		if(num>=0)
		{
			System.out.println(num+" is a positive Number");
		}
	}
}
public class BeforeException {

	public static void main(String[] args) {

		BasicMaths obj=new BasicMaths();
		obj.addition(20, 50);
		obj.substraction(25, 10);
		obj.multiplication(12, 10);
		obj.division(20, 0);
		obj.modResult(17, 3);
		obj.verifyEvenNumber(34);
		obj.verifyOddNumber(71);
		obj.isPositiveNumber(27);
	}
}



