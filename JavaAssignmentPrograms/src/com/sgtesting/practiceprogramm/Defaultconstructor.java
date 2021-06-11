package com.sgtesting.practiceprogramm;

class Student
{
	String name;
	int age;
}
class village
{
	String name;
	int pcode;
}

public class Defaultconstructor {

	public static void main(String[] args) {
		Student obj=new Student();
		obj.name="basu";
		obj.age=25;
		System.out.println("name of the student is "+obj.name);
		System.out.println("age "+obj.age);
		System.out.println("+++++++++++++++++++++++++++++++++++");	

		village obj1=new village();
		obj1.name="kolavi";
		obj1.pcode=591344;
		System.out.println("name   "+obj1.name);
		System.out.println("pincode "+obj1.pcode);

	}

}
