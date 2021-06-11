package com.sgtesting.abstractdemo;
abstract class King
{
	int age;

	static String name;

	void display1(String name)
	{
		System.out.println("The name of variable is: "+name);
	}
	static void addition(int a,int b)
	{
		System.out.println(" Static addition result"+(a+b));
	}

	void substraction(int a,int b)
	{
		System.out.println(" Instance Method Substraction Result:"+(a-b));
	}
	static
	{
		System.out.println("It is static block");
	}
}
class King1 extends King
{
	King1(String name1)
	{
		super.display1(name1);
	}
	void display1(String name1)
	{
		System.out.println("The name in subclass is"+name1);
	}
}
class King2 extends King1
{
	King2(String name2,String name3)
	{
		super(name2);
		super.display1(name3);
	}
	void display1(String name1)
	{
		System.out.println("The name Second subclass is"+name1);
	}
	
}

public class Variable {
	public static void main(String[] args) {
		King2 obj=new King2("BAsu","Pavan");
		obj.substraction(20,10);
		King.name="basu";
		obj.display1("BASU");
		//King.addition(10, 20);

		/*
		 * obj.age=25; System.out.println("the age of instance variable is :"+obj.age);
		 * 
		 * King.name="GOPAL";
		 * System.out.println("The name of static variable is:"+King.name);
		 */






	}

}
