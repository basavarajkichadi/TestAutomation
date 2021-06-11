package com.sgtesting.defaultconstructor;
class Twowheelers
{
	String companyname;
	String colour;
	int maxspeed;
	int average;
	int Enginecc;
	int price;
}
class Fourwheelers
{
	String companyname;
	String colour;
	int maxspeed;
	int average;
	int Enginecc;
	int price;
}
public class Vehicle {

	public static void main(String[] args) {
	
		Twowheelers bike=new Twowheelers();
		bike.companyname="hero honda";
		bike.colour="white";
		bike.maxspeed=160;
		bike.average=60;
		bike.Enginecc=150;
		bike.price=80000;
		System.out.println("Company Name: "+bike.companyname);
		System.out.println("colour: "+bike.colour);
		System.out.println("max speed: "+bike.maxspeed);
		System.out.println("average: "+bike.average);
		System.out.println("engine cc: "+bike.Enginecc);
		System.out.println("price: "+bike.price);
		System.out.println("********************");
		
		Fourwheelers car=new Fourwheelers();
		car.companyname="Hundai";
		car.colour="Black";
		car.maxspeed=300;
		car.average=20;
		car.Enginecc=1500;
		car.price=100000;
		System.out.println("Company Name: "+car.companyname);
		System.out.println("colour: "+car.colour);
		System.out.println("max speed: "+car.maxspeed);
		System.out.println("average: "+car.average);
		System.out.println("engine cc: "+car.Enginecc);
		System.out.println("price: "+car.price);
		
	}

}
