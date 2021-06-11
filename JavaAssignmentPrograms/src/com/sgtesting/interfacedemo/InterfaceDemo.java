package com.sgtesting.interfacedemo;
interface University
{
	void showuniversity(String name);
	

}
class University1 implements University
{
	public void showuniversity(String name)
	{
		System.out.println("Name is: "+name);
	}
	void showCollege(String name)
	{
		System.out.println("College name is: "+name);
	}
}
public class InterfaceDemo {
	public static void main(String[] args) {
		University1 obj=new University1();
		obj.showuniversity("VTU");
		obj.showCollege("AITM BELAGAVI");
	}
}
