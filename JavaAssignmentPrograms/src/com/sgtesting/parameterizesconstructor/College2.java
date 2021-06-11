package com.sgtesting.parameterizesconstructor;

class Student1
{
	String firstname;
	int age;
	Student1(String fn,int Age)
	{
		firstname=fn;
		System.out.println("First name: "+fn);
		System.out.println("age :"+Age);
		System.out.println("**************");
	}
	void display()
	{
		System.out.println("first name: "+firstname);
		System.out.println("age: "+age);
	}
}

public class College2 {

	public static void main(String[] args) {
		
Student1 msd=new Student1("mahi",29);
	msd.display();

	}

}
