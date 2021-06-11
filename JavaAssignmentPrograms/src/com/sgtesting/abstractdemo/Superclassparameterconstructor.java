package com.sgtesting.abstractdemo;
abstract class Human1
{
	abstract void showName(String name);
	abstract void shownum(int n);
	Human1(int age)
	{
		System.out.println("Age in Superclass is"+age);
	}
}
abstract class Human2 extends Human1
{
	Human2(int age)
	{
		super(age);
	}
	void showName(String name)
	{
		System.out.println("Name is "+name);
	}

}
class Human3 extends Human2
{
	Human3(int age)
	{
		super(age);

	}	
	void showName(String name)
	{
		System.out.println("Name is "+name);
	}
	void shownum(int n) 
	{
		System.out.println("the number is"+n);
	}
}
public class Superclassparameterconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human3 obj=new Human3(25);
	}
}
