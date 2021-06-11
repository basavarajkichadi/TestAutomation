package com.sgtesting.abstractdemo;
abstract class Area
{
	abstract void display(String name);
	abstract void display1(int dia);
	Area(int age)
	{
		System.out.println("The age is "+age);
	}
}
abstract class Area1 extends Area
{
	Area1(int age1)
	{
		super(age1);
	}
	void display(String name)
	{
		System.out.println("The Name in First Subclass is"+name);
	}
	void addition(int a,int b)
	{
		System.out.println("Addition result"+(a+b));
	}
}
class Area2 extends Area1
{
	Area2(int age2)
	{
		super(age2);
	}
	
	void display1(int dia)
	{
		System.out.println("The diameter is "+dia);
	}
	void showNumbers(int a[])
	{
		System.out.println("The Numbers are");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
public class MultilevelBasedsubclass2 {
	public static void main(String[] args) {
		Area obj=new Area2(30);
		obj.display1(25);
		
		



	}

}
