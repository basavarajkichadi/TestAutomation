package com.sgtesting.practiceprogramm;

class india
{
	int age;
	String place;
	
	india(int Age,String place)
	{
		age=Age;
		this.place=place;
		
		System.out.println("age "+age);
		System.out.println("place "+place);
		System.out.println("**********************");
	}
}
class karnataka
{
	String name;
	int dist;
	
	karnataka(String name,int dist)
	{
		this.name=name;
		this.dist=dist;
		
		System.out.println("name"+name);
		System.out.println("District"  +this.dist);
		System.out.println("*****************");
	}
}

public class Parameterconsturctor {

	public static void main(String[] args) {
		india obj=new india(1500,"karnataka");
		
		india obj2=new india(5244,"belagavi");
		
		 karnataka obj3=new  karnataka("gokak",30);
		 
		 karnataka obj4=new  karnataka("gadag",28);
		
		

	}

}
