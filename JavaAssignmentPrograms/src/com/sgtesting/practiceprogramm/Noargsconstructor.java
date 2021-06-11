package com.sgtesting.practiceprogramm;

class Name
{
	String name;
	int age;
	Name()
	{
		name="basu";
		age=25;
		System.out.println("name "+name);
		System.out.println("age "+age);
		System.out.println("++++++++++++++++++");
	}
}
class Bharat
{
	String name;
	int amount;
	Bharat()
	{
		name="india";
		amount=150000;
		System.out.println("name "+name);
		System.out.println("amount  "+amount);
		System.out.println("----------------------------");
	}
}

public class Noargsconstructor {

	public static void main(String[] args) {
		
		Name obj=new Name();
		
		Bharat obj1=new Bharat();
		
	}

}
