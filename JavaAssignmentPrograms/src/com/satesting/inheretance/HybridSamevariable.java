package com.satesting.inheretance;
class Hybrid1
{
	String name;
	void display1(String name)
	{
		this.name=name;
		System.out.println("Name in super class is "+name);
	}
}
class Hybrid2 extends Hybrid1
{
	String name;
	Hybrid2(String name)
	{
		super.display1(name);
	}
	void display2(String name)
	{
		this.name=name;
		System.out.println("Namen in  first subclass is "+name);
	}
}
class Hybrid3 extends Hybrid1
{
	String name;
	Hybrid3(String name)
	{
		super.display1(name);
	}
	void diaplay3(String name)
	{
		this.name=name;
		System.out.println("Name in Second subclass is "+name);
	}
}
class Hybrid4 extends Hybrid3
{
	String name;
	Hybrid4(String name, String name1)
	{
		super(name);
		super.diaplay3(name1);
	}
	void display4(String name)
	{
		this.name=name;
		System.out.println("Name in Third subclass is: "+name);
	}
}
public class HybridSamevariable {
	public static void main(String[] args) {
		Hybrid4 obj=new Hybrid4("Basu","kichadi");
		obj.display4("Gopal");
		obj.display1("Scoot");
		obj.diaplay3("Allen");

		Hybrid2 obj1=new Hybrid2("Allen");
		obj1.display2("The Rock");
	}
}
