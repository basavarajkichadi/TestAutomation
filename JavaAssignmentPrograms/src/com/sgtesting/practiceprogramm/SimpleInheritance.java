package com.sgtesting.practiceprogramm;
class Maths
{
	void addition(int a,int b)
	{
		System.out.println("Addition  "+(a+b));
	}
}
class Maths1 extends Maths
{
	void substraction(int a, int b)
	{
		System.out.println("Sunstraction "+(a-b));
	}
}
class Maths2 extends Maths1
{
	void multiplication(int a,int b)
	{
		System.out.println("multiplication "+(a*b));
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths2 obj=new Maths2();
		obj.addition(20, 10);
		obj.multiplication(20, 25);
		obj.substraction(50, 20);
	
		
		

	}

}
