package com.sgtesting.interfacedemo;
class Demo1
{
	final void display()
	{
		System.out.println("in Super classs the display method");
	}
}
class Demo2 extends Demo1
{
	void display1()  //we cannot override from any other subclass
	{
		
	}
	
}
public class FinalKeyDemo {
	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		System.out.println("the nae is");
		
		
		

	}

}
