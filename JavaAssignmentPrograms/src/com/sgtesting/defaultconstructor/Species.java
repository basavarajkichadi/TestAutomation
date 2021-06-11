package com.sgtesting.defaultconstructor;
	class Birds{
		String Name;
		String color;
		int noofwings;
		String speciality;
		String Lovableornot;
	}
	class Animals{
		String Name;
		String color;
		String domesticornondomestic;
		int maxage;
		String Speciality;
	}
	class Fruits{
		String Name;
		String color;
		String speciality;
		String Vitamin;
		String Helpsfor;
	}
	public class Species{
		public static void main(String[] args) {
			Birds a=new Birds();
			a.Name="Crow";
			a.color="Black";
			a.noofwings=2;
			a.Lovableornot="For Some People";
			a.speciality="Clever";
			System.out.println("Name :"+a.Name);
			System.out.println("Color :"+a.color);
			System.out.println("No. of Wings :"+a.noofwings);
			System.out.println("Lovable or Not :"+a.Lovableornot);
			System.out.println("Spciality :"+a.speciality);
			System.out.println("---------------*********--------------");
			
			Animals b=new Animals();
			b.Name="Lion";
			b.color="Brown-Red";
			b.domesticornondomestic="Non-Domestic";
			b.maxage=50;
			b.Speciality="Brutal Hunting";
			System.out.println("King of the Jungle :"+b.Name);
			System.out.println("Color :"+b.color);
			System.out.println(" Domestic or What? -->"+b.domesticornondomestic);
			System.out.println("Maximum Age of living :"+b.maxage);
			System.out.println("What's the Speciality? -->"+b.Speciality);
			System.out.println("---------------*******---------------");
			
			Fruits c=new Fruits();
			c.Name="Carrot";
			c.color="Light Red";
			c.speciality="Water content with Zero% Fat";
			c.Helpsfor="Protection of Eyes inner parts to be more focus";
			c.Vitamin="A";
			System.out.println("Name :"+c.Name);
			System.out.println("Color :"+c.color);
			System.out.println("Special Thing :"+c.speciality);
			System.out.println("Advantage :"+c.Helpsfor);;
			System.out.println("Vitamin Content :"+c.Vitamin);
			
		}

}
