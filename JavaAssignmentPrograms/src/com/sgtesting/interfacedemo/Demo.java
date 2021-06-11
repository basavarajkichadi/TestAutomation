package com.sgtesting.interfacedemo;
interface Featurephone
{
	void calling();
	void messaging();
}
interface Smartphone
{
	void Vcalling();
	void Internet();
}
abstract class Phone1 implements Featurephone
{
	abstract void display();
	public void calling()
	{
		System.out.println("only Calling in Feature phone");
	}
	public void messaging()
	{
		System.out.println("only Messaging in feature phone");
	}
}
class Phone2 extends Phone1 implements Featurephone,Smartphone
{
	public void calling()
	{
		super.calling();
		super.messaging();
		System.out.println("Calling in Feature phone");
	}
	public void messaging()
	{
		
		System.out.println("Messaging in feature phone");
	}
	public	void Vcalling()
	{
		System.out.println("Video calling in Smart phone");
	}
	public void Internet()
	{
		System.out.println("using internet in smart phone");
	}
	void display()
	{
		System.out.println("Abstract method");
	}
}
	
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Phone2 obj=new Phone2();
		obj.calling();
		obj.messaging();
		obj.Vcalling();
		obj.Internet();
		obj.display();
		
		
	}

}
