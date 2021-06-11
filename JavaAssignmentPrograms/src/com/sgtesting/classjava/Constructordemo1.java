package com.sgtesting.classjava;
class Holy
{
	String Fname;
	int age;
	Holy(String Fname,int age)
	{
		this.Fname=Fname;
		this.age=age;
		System.out.println(Fname);
		System.out.println(age);
	}
}

public class Constructordemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Holy obj=new Holy("basu",25);
		Holy low=new Holy("s",22);
		

	}

}
