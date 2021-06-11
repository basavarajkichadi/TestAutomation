package com.sgtesting.noargsconstructor;


class Footballplayers
{
	String Name;
	int Age;
	int Salary;
	int Height;
	int Weight;

	Footballplayers()
	{
		Name="Ronaldo";
		Age=38;
		Salary=500000;
		Height=6;
		Weight=65;
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Salary:"+Salary);
		System.out.println("Height:"+Height);
		System.out.println("Weight:"+Weight);
		System.out.println("***************************");
	}
}
class Cricketplayers
{
	String Name;
	int Age;
	int Salary;
	int Height;
	int Weight;

	Cricketplayers()
	{
		Name="Dhoni";
		Age=40;
		Salary=800000;
		Height=5;
		Weight=75;
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Salary:"+Salary);
		System.out.println("Height:"+Height);
		System.out.println("Weight:"+Weight);
		System.out.println("***********************");
	}
}
class Hockeyplayers
{
	String Name;
	int Age;
	int Salary;
	int Height;
	int Weight;

	Hockeyplayers()
	{
		Name="Guruvinder Singh";
		Age=30;
		Salary=400000;
		Height=5;
		Weight=55;
		System.out.println("Name: "+Name);
		System.out.println("Age: "+Age);
		System.out.println("Salary:"+Salary);
		System.out.println("Height:"+Height);
		System.out.println("Weight:"+Weight);
	}
}
public class Players {

	public static void main(String[] args) {
		Footballplayers player=new Footballplayers();


		Cricketplayers mahi=new Cricketplayers();



		Hockeyplayers bigball=new Hockeyplayers();



	}

}



