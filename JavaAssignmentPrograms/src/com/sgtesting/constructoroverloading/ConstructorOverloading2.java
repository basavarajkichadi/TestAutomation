package com.sgtesting.constructoroverloading;
class Student
{
	Student(String name)
	{
		System.out.println("name of the College is: "+name);
	}
	Student(int num)
	{
		System.out.println("no of students: "+num);
	}
	Student(String area,int no)
	{
		System.out.println("area is: "+area+" no of staffs: "+no);
		
	}
}

public class ConstructorOverloading2 {

	public static void main(String[] args) {
		Student stu=new Student("AITM BELAGAVI");
		Student stu1=new Student( "BELAGAVI",50);
		Student stu2=new Student("1500");  
		

	}

}
