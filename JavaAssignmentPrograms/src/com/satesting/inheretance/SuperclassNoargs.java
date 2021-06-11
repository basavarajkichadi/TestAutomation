package com.satesting.inheretance;
class Human
{
	String fname;
	int age;
	Human(String fname,int age)
	{
		this.fname=fname;
		this.age=age;
		System.out.println("First name " +fname);
		System.out.println("age "+this.age);
	}	
}
class Human1 extends Human
{
	Human1(String name,int age)
	{
		super(name,age);
	}
}
class Human2 extends Human1
{
	Human2(String name,int age)
	{
		super(name,age);
	}
}

public class SuperclassNoargs {

	public static void main(String[] args) {
		Human1 obj=new Human1("Basu",25);

	}

}
