package com.satesting.inheretance;
class Testing
{
	Testing()
	{

		System.out.println("Its a testing construcror in super class");
	}
}
class Testing1 extends Testing
{
	Testing1()
	{

		System.out.println("Its a testing1 first subclass constructor");
	}
}
class Testing2 extends Testing1
{
	Testing2()
	{
		System.out.println("Its a testing2  second subclassconstructor");
	}
}
public class ExecutionOrder {
	public static void main(String[] args) {
		Testing2 obj=new Testing2();

	}
}
