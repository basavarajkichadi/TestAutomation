package com.sgtesting.abstractdemo;
abstract class Fruit
{
	abstract void showName(String name);
	abstract void showPrice(int price);
}
abstract class Fruit1 extends Fruit
{
	void ShowNumber(int count)
	{
		System.out.println("The Number of Fruits present are: "+count);
	}
}
class Fruit2 extends Fruit1
{
	void showName(String name)
	{
		System.out.println("Name of The Fruit is: "+name);
	}
	void showPrice(int price)
	{
		System.out.println("Price Of the Fruit is "+price);
	}
	void displayShowage(String age)
	{
		System.out.println("The age is"+age);
	}
	
}
public class Multilevelimmidiateparent {

	public static void main(String[] args) {
		Fruit1 obj1=new Fruit2();
		obj1.ShowNumber(10);
		obj1.showName("Apple");
		obj1.showPrice(25000);
		

	}

}
