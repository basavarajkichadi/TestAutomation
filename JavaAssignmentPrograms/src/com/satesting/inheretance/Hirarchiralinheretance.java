package com.satesting.inheretance;
class Sample
{
	void addition(int a, int b)
	{
		System.out.println("Addition "+(a+b));
	}
}
class Sample1 extends Sample
{
	void Substraction(int a, int b)
	{
		System.out.println("Substraction"+(a-b));
	}
}
class Sample2 extends Sample
{
	void Multilplication(int a,int b)
	{
		System.out.println("multiplication"+(a*b));
	}
}

public class Hirarchiralinheretance {

	public static void main(String[] args) {
		Sample1 obj=new Sample1();
		obj.addition(10, 20);
		obj.Substraction(10, 5);

		Sample2 obj1=new Sample2();
		obj1.addition(10, 20);
		obj1.Multilplication(10, 20);


	}

}
