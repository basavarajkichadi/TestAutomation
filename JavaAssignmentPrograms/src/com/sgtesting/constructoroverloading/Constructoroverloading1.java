package com.sgtesting.constructoroverloading;

class University

{
	University(String name)
	{
		System.out.println("Name of University is :"+name);
	}
	University(int num)
	{
		System.out.println("Number of students:"+ num);
	}

	University(String s,int number)
	{
		System.out.println("Adress "+s+" No of colleges under University is: "+number);
	}
	University(int s,String b)
	{
		System.out.println(+s+b);
	}
	
}

public class Constructoroverloading1 {

	public static void main(String[] args) {
		University u=new University("belagavi",100);
		University u1=new University("VTU");
		University u2=new University(5000);
		University u4=new University(25,"basu");

	}

}
