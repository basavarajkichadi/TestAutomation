package com.sgtesting.interfacedemo;
interface Library1
{
	void showName(String name);
}

interface Library2 extends Library1
{
	void showBooks(int Books);
}
interface Library3 extends Library1
{
	void showAuthor(String name);	
}
interface Library4 extends Library3
{
	void StudentNumber(int student);
}
class Library5 implements Library4,Library2
{
	public void showName(String name)
	{
		System.out.println("The Library name is: "+name);
	}
	public void showBooks(int Books)
	{
		System.out.println("The Number of books Available in Library are: "+Books);
	}
	public void showAuthor(String name)
	{
		System.out.println("The Author name of majority of books is: "+name);
	}
	public void StudentNumber(int students) 
	{
		System.out.println("The Number of Students in Library are:"+students);
	}
	
}

public class HybridInterface {

	public static void main(String[] args) {
		Library5 obj=new Library5();
		obj.showName("KNOWLEGE CENTRE");
		obj.showBooks(5000);
		obj.showAuthor("DINESH PUBLICATIONS");
		obj.StudentNumber(1000);

	}

}
