package com.sgtesting.parameterizesconstructor;


class Birds{
	String Name;
	String color;
	int noofwings;
	String speciality;
	String Lovableornot;
	Birds(String name, String Col, int noofwings, String speciality)
	{
		this.Name=name;
		color=Col;
		this.noofwings=noofwings;
		this.speciality=speciality;
		System.out.println("Name :"+Name);
		System.out.println("Color :"+Col);
		System.out.println("No. of Wings :"+noofwings);
		System.out.println("Spciality :"+speciality);
		System.out.println("---------------*********--------------");

	}
}
class Animals{
	String Name;
	String color;
	String domesticornondomestic;
	int maxage;
	String Speciality;
	Animals(String Name, String Col, int maxage, String Speciality)
	{
		this.Name=Name;
		color=Col;
		this.maxage=maxage;
		this.Speciality=Speciality;
		System.out.println("King of the Jungle :"+Name);
		System.out.println("Color :"+color);
		System.out.println("Maximum Age of living :"+maxage);
		System.out.println("What's the Speciality? -->"+Speciality);
		System.out.println("---------------*******---------------");
	}
}
class Fruits{
	String Name;
	String color;
	String speciality;
	String Vitamin;
	String Helpsfor;
	Fruits(String Name,String Col, String Speciality, String Vit)
	{
		this.Name=Name;
	    color=Col;
		this.speciality=Speciality;
		Vitamin=Vit;
		System.out.println("Name :"+Name);
		System.out.println("Color :"+Col);
		System.out.println("Special Thing :"+speciality);
		System.out.println("Vitamin Content :"+Vit);
		System.out.println("---------------*******---------------");
	}
}
public class Species {

	public static void main(String[] args) {
		Birds oz=new Birds("crow","Black",2,"nothing");
		Birds op=new Birds("sparraow","green",2,"no-thing");
		Animals ok=new Animals("cow","white",45,"nothing");
		Animals ow=new Animals("cow","white",45,"nothing");
		Fruits oc=new Fruits("Apple","Red","nothing","A");
		Fruits oy=new Fruits("watemelon","green","nothing","B");
	}

}




