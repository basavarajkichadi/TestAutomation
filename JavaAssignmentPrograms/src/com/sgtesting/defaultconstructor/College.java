package com.sgtesting.defaultconstructor;
class Student
{
	String Name;
	String City;
	String State;
	int Pincode;
	int Id;
	long phoneno;
}
class Library
{
	String Name;
	int NumberofWorkers;
	int NumberofStudents;
	int NumberofBooks;
	String DeptName;
}
class Sports
{
	String Name;
	int NumersofPlayers;
	int NumberofUmpire;
	int NumberofBatsAvailable;
	int NumberofBallsAvailble;
}
public class College {

	public static void main(String[] args) {
		Student Rahul=new Student();
		Rahul.Name="Basu";
		Rahul.City="Gokak";
		Rahul.State="karnataka";
		Rahul.Pincode=591344;
		Rahul.phoneno=9878956558l;
		Rahul.Id=123;
		System.out.println("Name: "+Rahul.Name);
		System.out.println("City: "+Rahul.City);
		System.out.println("State:"+Rahul.State);
		System.out.println("Pincode: "+Rahul.Pincode);
		System.out.println("Phoneno: "+Rahul.phoneno);
		System.out.println("Id:" +Rahul.Id);
		System.out.println("*********************");
		
		Library name=new Library();
		name.Name="great library";
		name.NumberofWorkers=10;
		name.NumberofStudents=500;
		name.DeptName="mechanical";
		name.NumberofBooks=5000;
		System.out.println("Name:"+name.Name);
		System.out.println("NumberofWorkers: "+name.NumberofWorkers);
		System.out.println("NumberofStudents: "+name.NumberofStudents);
		System.out.println("DeptName: "+name.DeptName);
		System.out.println("NumberofBooks: "+name.NumberofBooks);
		System.out.println("*************************");
		
		Sports msd=new Sports();
		msd.Name="cricket";
		msd.NumersofPlayers=11;
		msd.NumberofUmpire=3;
		msd.NumberofBatsAvailable=1;
		msd.NumberofBallsAvailble=2;
		System.out.println("Name: "+msd.Name);
		System.out.println("NumersofPlayers: "+msd.NumersofPlayers);
		System.out.println("NumberofUmpire: "+msd.NumberofUmpire);
		System.out.println("NumberofBatsAvailable: "+msd.NumberofBatsAvailable);
		System.out.println("NumberofBallsAvailble: "+msd.NumberofBallsAvailble);
	}

}
