package com.sgtesting.noargsconstructor;


class Student
{
	String Name;
	String City;
	String State;
	int Pincode;
	int Id;
	long phoneno;
	Student()
	{
		Name="Basu";
		City="Gokak";
		State="karnataka";
		Pincode=591344;
		phoneno=9878956558l;
		Id=123;
		System.out.println("Name: "+Name);
		System.out.println("City: "+City);
		System.out.println("State:"+State);
		System.out.println("Pincode: "+Pincode);
		System.out.println("Phoneno: "+phoneno);
		System.out.println("Id:" +Id);
		System.out.println("*********************");
	}
}
class Library
{
	String Name;
	int NumberofWorkers;
	int NumberofStudents;
	int NumberofBooks;
	String DeptName;

	Library()
	{
		Name="great library";
		NumberofWorkers=10;
		NumberofStudents=500;
		DeptName="mechanical";
		NumberofBooks=5000;
		System.out.println("Name:"+Name);
		System.out.println("NumberofWorkers: "+NumberofWorkers);
		System.out.println("NumberofStudents: "+NumberofStudents);
		System.out.println("DeptName: "+DeptName);
		System.out.println("NumberofBooks: "+NumberofBooks);
		System.out.println("*************************");
	}
}
class Sports
{
	String Name;
	int NumersofPlayers;
	int NumberofUmpire;
	int NumberofBatsAvailable;
	int NumberofBallsAvailble;

	Sports()
	{
		Name="cricket";
		NumersofPlayers=11;
		NumberofUmpire=3;
		NumberofBatsAvailable=1;
		NumberofBallsAvailble=2;
		System.out.println("Name: "+Name);
		System.out.println("NumersofPlayers: "+NumersofPlayers);
		System.out.println("NumberofUmpire: "+NumberofUmpire);
		System.out.println("NumberofBatsAvailable: "+NumberofBatsAvailable);
		System.out.println("NumberofBallsAvailble: "+NumberofBallsAvailble);
	}
}
public class College {

	public static void main(String[] args) {
		Student Rahul=new Student();


		Library name=new Library();


		Sports msd=new Sports();


	}




}


