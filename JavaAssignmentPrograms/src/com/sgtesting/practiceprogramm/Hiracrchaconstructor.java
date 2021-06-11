package com.sgtesting.practiceprogramm;
class City1
{
	String fname;
	City1(String fname)
	{
		this.fname=fname;
		System.out.println("Name in Superclass Is: "+this.fname);
	}
	int age;
	City1(int age)
	{
		this.age=age;
		System.out.println("Age is: "+age);
	}
	String Lastname;
	int newage;
	City1(String Lastname,int newage)
	{
		this.Lastname=Lastname;
		this.newage=newage;
		System.out.println("LastName is: "+this.Lastname+"  Newage is: "+newage);
	}	
}
class City2 extends City1
{
	City2(String fname)
	{
		super(fname);
	}
	City2(int age)
	{
		super(age);
	}
	City2(String Lastname,int newage)
	{
		super(Lastname,newage);
	}
}
class City3 extends City1
{
	City3(String name)
	{
		super(name);
	}
	City3(int age)
	{
		super(age);
	}
	City3(String Lastname,int newage)
	{
		super(Lastname,newage);
	}
}


public class Hiracrchaconstructor {

	public static void main(String[] args) {
		City3 obj=new City3("Basavaraj");
		City3 obj1=new City3(25);
		City3 obj2=new City3("kichadi",25);
		
		City2 obj3=new City2("Basavaraj");
		City2 obj4=new City2(25);
		City2 obj5=new City2("kichadi",25);
		
	

	}

}



