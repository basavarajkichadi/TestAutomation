package com.satesting.inheretance;
class Area1
{
	void displayArea(String name)
	{
		System.out.println("Name in Super class: "+name);
	}
}
class Area2 extends Area1
{
	Area2(String name)
	{
		super.displayArea(name);
	}
	void displayArea(String name)
	{
		System.out.println("Name in First Subclass: "+name);
	}
}
class Area3 extends Area2
{
	Area3(String name ,String name1)
	{
		super(name);
		super.displayArea(name1);
	}
	void displayArea(String name)
	{
		System.out.println("In Second Subclass: "+name);
	}
}
public class MultilevelsMethodOverriding {
	public static void main(String[] args) {	
		Area3 obj=new Area3("Circle","Rectangle");
		obj.displayArea("Square");

	}
}
