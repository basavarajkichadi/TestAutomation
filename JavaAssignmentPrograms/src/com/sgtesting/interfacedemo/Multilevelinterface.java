package com.sgtesting.interfacedemo;
interface Car1
{
	void displayName(String name);
}
interface Car2 extends Car1
{
	void displayPrice(int price);
}
interface Car3 extends Car2
{
	void displayVariant(String Variant);
}
class Car4 implements Car3
{
	public void displayName(String name)
	{
		System.out.println("The car name is :"+name);
	}
	public void displayPrice(int price)
	{
		System.out.println("Tje price of the car is: "+price);
	}
	public void displayVariant(String variant)
	{
		System.out.println("The car variant is : "+variant);
	}
}
public class Multilevelinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car4 obj=new Car4();
		obj.displayName("VITARA BREEZA");
		obj.displayPrice(1250000);
		obj.displayVariant("PERTROL/DIESEL");

	}

}
