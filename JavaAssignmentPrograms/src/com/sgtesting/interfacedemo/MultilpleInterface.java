package com.sgtesting.interfacedemo;
interface Animal
{
	void displayAnimal(String name);
	void displayAnimalage(int age);
}
interface Animal1 
{
	void addition(int a,int b);

}
class Animal2 implements Animal,Animal1
{
	public void displayAnimal(String name)
	{
		System.out.println("NAme of animal is: "+name);
	}
	public void displayAnimalage(int age)
	{
		System.out.println("age is :"+age);
	}
	public void addition(int a,int b)
	{
		System.out.println("Addition Result: "+(a+b));
	}
	void substraction(int a,int b)
	{
		System.out.println("Substraction result: "+(a-b));
	}
}
public class MultilpleInterface {

	public static void main(String[] args) {
		Animal2 obj=new Animal2();
		obj.displayAnimal("TIGER");
		obj.displayAnimalage(15);
		obj.addition(10, 20);
		obj.substraction(20, 5);

	}

}
