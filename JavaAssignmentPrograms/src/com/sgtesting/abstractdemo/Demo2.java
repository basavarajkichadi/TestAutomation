package com.sgtesting.abstractdemo;
abstract class College
{
	abstract void showCollegeName(String name);
	abstract void showCity(String cityname);
	void showBranches(String branches[])
	{
		System.out.println("Branch Names...");
		for(int i=0;i<branches.length;i++)
		{
			System.out.println("Branch Name :"+branches[i]);
		}
	}
}

class Engg extends College
{
	void showCollegeName(String name)
	{
		System.out.println("Colleg Name :"+name);
	}
	
	void showCity(String cityname)
	{
		System.out.println("City Name :"+cityname);
	}
	
	void displayAddress(String address)
	{
		System.out.println("Address :"+address);
	}
}
public class Demo2 {

	public static void main(String[] args) {
		College sln=new Engg();
		sln.showCollegeName("SLN Engg College");
		sln.showCity("Bangalore");
		String s[]= {"EEE","E&CE","CSE"};
		sln.showBranches(s);
	///	sln.displayAddress("7th Main 5th Cross Vijaynagar");


	}

}
