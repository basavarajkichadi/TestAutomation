package com.satesting.inheretance;
class City1
{
	String fname;
	City1(String fname)
	{
		this.fname=fname;
		System.out.println("Name in Superclass Is: "+this.fname);
	}
	int age;
	City1(int age)
	{
		this.age=age;
		System.out.println("Age is: "+age);
	}
	String Lastname;
	int newage;
	City1(String Lastname,int newage)
	{
		this.Lastname=Lastname;
		this.newage=newage;
		System.out.println("Name is: "+this.Lastname+"  Newage is: "+newage);
	}	
}
class City2 extends City1
{
	City2(String fname)
	{
		super(fname);
		
	}
	City2(int age)
	{
		super(age);
	}
	City2(String Lastname,int newage)
	{
		super(Lastname,newage);
	}
}
class City3 extends City1
{
	City3(String name)
	{
		super(name);
		System.out.println("The first name in subclass is"+name);
	}
	City3(int age)
	{
		super(age);
	}
	City3(String Lastname,int newage)
	{
		super(Lastname,newage);
	}
	/*City3(int a,int b)
	{
		System.out.println("The addition Result is"+(a+b));
	}*/
	void display(int age)
	{
		System.out.println("the age of pavan is "+age);
	}
}
class City4 extends City3
{
	City4(String name)
	{
		super(name);
	}
	City4(int age)
	{
		super(age);
	}
	City4(String Lastname,int newage)
	{
		super(Lastname,newage);
	}
	
}
public class Hybridconstructoroverloading2 {
	public static void main(String[] args) {
		City4 obj=new City4("Kichadi ",25);
		City4 obj1=new City4("PAVAN");
		obj.display(25);
		
		
		
	}
		
}
