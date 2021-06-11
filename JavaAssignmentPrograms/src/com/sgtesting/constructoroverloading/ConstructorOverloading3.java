package com.sgtesting.constructoroverloading;
class Employ
{
	Employ(String name)
	{
		System.out.println("Name of the employe is : "+name);
	}
	Employ(int age)
	{
		System.out.println("age of the employe :"+age);
	}
	Employ(int salary,String dname)
	{
		System.out.println("salary is :"+salary+"\ndepatrment name is :"+dname);
	}
	
}

public class ConstructorOverloading3 {

	public static void main(String[] args) {
		Employ emp1=new Employ(25000,"mechanical");
		Employ emp2=new Employ("Basu");
		Employ emp3=new Employ(25);

	}

}
