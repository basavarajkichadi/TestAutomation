package com.sgtesting.defaultconstructor;
class Footballplayers
{
	String Name;
	int Age;
	int Salary;
	int Height;
	int Weight;
}
class Cricketplayers
{
	String Name;
	int Age;
	int Salary;
	int Height;
	int Weight;
}
class Hockeyplayers
{
	String Name;
	int Age;
	int Salary;
	int Height;
	int Weight;
}
public class Players {

	public static void main(String[] args) {
		Footballplayers player=new Footballplayers();
		player.Name="Ronaldo";
		player.Age=38;
		player.Salary=500000;
		player.Height=6;
		player.Weight=65;
		System.out.println("Name: "+player.Name);
		System.out.println("Age: "+player.Age);
		System.out.println("Salary:"+player.Salary);
		System.out.println("Height:"+player.Height);
		System.out.println("Weight:"+player.Weight);
		System.out.println("***************************");
		
		Cricketplayers mahi=new Cricketplayers();
		
		mahi.Name="Dhoni";
		mahi.Age=40;
		mahi.Salary=800000;
		mahi.Height=5;
		mahi.Weight=75;
		System.out.println("Name: "+mahi.Name);
		System.out.println("Age: "+mahi.Age);
		System.out.println("Salary:"+mahi.Salary);
		System.out.println("Height:"+mahi.Height);
		System.out.println("Weight:"+mahi.Weight);
		System.out.println("***********************");
		
		Hockeyplayers bigball=new Hockeyplayers();
		bigball.Name="Guruvinder Singh";
		bigball.Age=30;
		bigball.Salary=400000;
		bigball.Height=5;
		bigball.Weight=55;
		System.out.println("Name: "+bigball.Name);
		System.out.println("Age: "+bigball.Age);
		System.out.println("Salary:"+bigball.Salary);
		System.out.println("Height:"+bigball.Height);
		System.out.println("Weight:"+bigball.Weight);
		
		
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				

	}

}
