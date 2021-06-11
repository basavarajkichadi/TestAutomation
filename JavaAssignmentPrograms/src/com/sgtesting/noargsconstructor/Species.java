package com.sgtesting.noargsconstructor;



class Birds
{
	String Name;
	String color;
	int noofwings;
	String speciality;
	String Lovableornot;

	Birds()
	{
		Name="Crow";
		color="Black";
		noofwings=2;
		Lovableornot="For Some People";
		speciality="Clever";
		System.out.println("Name :"+Name);
		System.out.println("Color :"+color);
		System.out.println("No. of Wings :"+noofwings);
		System.out.println("Lovable or Not :"+Lovableornot);
		System.out.println("Spciality :"+speciality);
		System.out.println("---------------*********--------------");
	}
}
class Animals
{
	String Name;
	String color;
	String domesticornondomestic;
	int maxage;
	String Speciality;

	Animals()
	{
		Name="Lion";
		color="Brown-Red";
		domesticornondomestic="Non-Domestic";
		maxage=50;
		Speciality="Brutal Hunting";
		System.out.println("King of the Jungle :"+Name);
		System.out.println("Color :"+color);
		System.out.println(" Domestic or What? -->"+domesticornondomestic);
		System.out.println("Maximum Age of living :"+maxage);
		System.out.println("What's the Speciality? -->"+Speciality);
		System.out.println("---------------*******---------------");
	}
}
class Fruits
{
	String Name;
	String color;
	String speciality;
	String Vitamin;
	String Helpsfor;

	Fruits()
	{
		Name="Carrot";
		color="Light Red";
		speciality="Water content with Zero% Fat";
		Helpsfor="Protection of Eyes inner parts to be more focus";
		Vitamin="A";
		System.out.println("Name :"+Name);
		System.out.println("Color :"+color);
		System.out.println("Special Thing :"+speciality);
		System.out.println("Advantage :"+Helpsfor);;
		System.out.println("Vitamin Content :"+Vitamin);
	}
}
public class Species{
	public static void main(String[] args) {
		Birds a=new Birds();


		Animals b=new Animals();


		Fruits c=new Fruits();


	}

}
