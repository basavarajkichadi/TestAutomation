package com.sgtesting.abstractdemo;
abstract class Method1
{
	abstract void showName(String name);
	abstract void showAge(int age);
}
class Method2 extends Method1
{
	 void showName(String name)
	 {
		 System.out.println("Name in First Subclass is "+name);
	 }
	 void showAge(int age)
	 {
		 System.out.println("Age in First Subclass is "+age);
	 }
}
class Method3 extends Method1
{	
	void showName(String name)
	 {
		 System.out.println("Name in Second Subclass is "+name);
	 }
	 void showAge(int age)
	 {
		 System.out.println("Age in Second Subclass is "+age);
	 }	
}
public class HirarchicalMethod {

	public static void main(String[] args) {
		Method3 obj=new Method3();
		obj.showName("Scoot");
		obj.showAge(50);
		
		Method2 obj1=new Method2();
		obj1.showName("Basavaraj");
		obj1.showAge(25);
	}

}
