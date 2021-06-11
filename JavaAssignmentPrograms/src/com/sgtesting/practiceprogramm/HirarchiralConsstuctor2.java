package com.sgtesting.practiceprogramm;
class Place1
{
	
	Place1(String fname)
	{
		System.out.println("Name in Superclass Is: "+fname);
	}
	Place1(int age)
	{
		System.out.println("Age is: "+age);
	}
	
	Place1(String Lastname,int newage)
	{
	
		System.out.println("LastName is: "+Lastname+"  Newage is: "+newage);
	}	
}
class Place2 extends Place1
{
	 Place2 (String fname)
	{
		super(fname);
	}
	 Place2 (int age)
	{
		super(age);
	}
	 Place2 (String Lastname,int newage)
	{
		super(Lastname,newage);
	}
}
class Place3  extends City1
{
	Place3(String name)
	{
		super(name);
	}
	Place3(int age)
	{
		super(age);
	}
	Place3(String Lastname,int newage)
	{
		super(Lastname,newage);
	}
}
public class HirarchiralConsstuctor2 {
	public static void main(String[] args) {
		City3 obj=new City3("Basavaraj");
		City3 obj1=new City3(25);
		City3 obj2=new City3("kichadi",25);
		
		City2 obj3=new City2("Prabhakar");
		City2 obj4=new City2(40);
		City2 obj5=new City2("Gudi",42);
	}
}

