package com.satesting.inheretance;
class Method4
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class Method5 extends Method4
{
	void addition(int a,int b)
	{
		super.addition(50, 30);
		System.out.println("SubstractionResult :"+(a-b));
	}
}
class Method6 extends Method4
{	 
	void addition(int a,int b)
	{
		super.addition(50, 80);
		System.out.println("Multiplication :"+(a*b));
	}
}
public class Hirarchaloverriding {
	public static void main(String[] args) {
		Method6 obj=new Method6();
		obj.addition(20, 30);
		Method5 obj1=new Method5();
		obj1.addition(80, 20);
	}
}
