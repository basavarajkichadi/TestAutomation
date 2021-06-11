package com.satesting.inheretance;
class Animal1
{
	void display1(String name)
	{
		
		System.out.println("Name in super class is "+name);
	}
}
class Animal2 extends Animal1
{
	Animal2(String name)
	{
		super.display1(name);
	}
	void display2(String name)
	{	
		System.out.println("Namen in  first subclass is "+name);
	}
}
class Animal3 extends Animal1
{
	Animal3(String name)
	{
		super.display1(name);
	}
	void diaplay3(String name)
	{
		System.out.println("Name in Second subclass is "+name);
	}
}
public class HybridSamevariable2 {
	public static void main(String[] args) {
		Animal3 obj=new Animal3("Basu");
		obj.diaplay3("Basu");
	
		obj.display1("Prabhakar");
		Animal2 obj1=new Animal2("GOPAL");
		obj1.display2("LION");
	

	}
}

