package com.sgtesting.noargsconstructor;

class Twowheelers
{
	String companyname;
	String colour;
	int maxspeed;
	int average;
	int Enginecc;
	int price;
	
	Twowheelers()
	{
		companyname="hero honda";
		colour="white";
		maxspeed=160;
		average=60;
		Enginecc=150;
		price=80000;
		System.out.println("Company Name: "+companyname);
		System.out.println("colour: "+colour);
		System.out.println("max speed: "+maxspeed);
		System.out.println("average: "+average);
		System.out.println("engine cc: "+Enginecc);
		System.out.println("price: "+price);
		System.out.println("********************");
	}
}
class Fourwheelers
{
	String companyname;
	String colour;
	int maxspeed;
	int average;
	int Enginecc;
	int price;
	
	Fourwheelers()
	{
		companyname="Hundai";
		colour="Black";
		maxspeed=300;
		average=20;
		Enginecc=1500;
		price=100000;
		System.out.println("Company Name: "+companyname);
		System.out.println("colour: "+colour);
		System.out.println("max speed: "+maxspeed);
		System.out.println("average: "+average);
		System.out.println("engine cc: "+Enginecc);
		System.out.println("price: "+price);
		
	}
}
public class Vehicle {

	public static void main(String[] args) {
	
		Twowheelers bike=new Twowheelers();
		
		
		Fourwheelers car=new Fourwheelers();
		
		
	}

}

