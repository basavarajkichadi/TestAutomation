package com.sgtesting.abstractdemo;
abstract class Members
{
	abstract void display(String name);
	static void display1(int age)
	{
		System.out.println("The age is "+age);
	}
}
class Members1 extends Members
{
	void display(String name)
	{
		System.out.println("The Name in First Subclass  is: "+name);
	}
}
class Members2 extends Members1
{

}
public class InstanceMembers {
	public static void main(String[] args) {
		Members2 obj=new Members2();
		obj.display("Basu");
		Members.display1(25);

	}
}
