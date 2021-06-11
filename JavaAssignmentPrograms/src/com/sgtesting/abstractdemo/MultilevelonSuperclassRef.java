package com.sgtesting.abstractdemo;
abstract class Apple
{
	abstract void showName(String name);
	abstract void showPrice(int price);
}
class Apple1 extends Apple
{
	void showName(String name)
	{
		System.out.println("Name of The Fruit is: "+name);
	}
	
	void showPrice(int  price)
	{
		System.out.println("The price of the Fruit is: "+price);
	}
	void showAge(int age)
	{
		System.out.println("the age is "+age);
	}
}
class Apple2 extends Apple1
{
	
}

public class MultilevelonSuperclassRef {

	public static void main(String[] args) {
		 Apple obj=new Apple2();
		/* Apple1 obj1=new Apple2("Apple",200);
		 obj1.showAge(25);
		*Apple2 obj2=new Apple2(''/);*/
		 
		 
		 
		// obj.showAge(); show age is not in abstract since we are passing  superclass obj as reference

	}

}
