package com.sgtesting.interfacedemo;
interface Human1
{
	void showname(String name);
	void showAge(int age);
}
interface Human2
{
	void showAdress(String adress);
}
class Human3 
{
	void showvVillageName(String VillageName)
	{
		System.out.println("Village NAme is:"+VillageName);
	}
}
abstract class Human4 extends Human3 implements Human1,Human2
{
	public void showname(String name)
	{
		System.out.println("The person Name is: "+name);
	}
	public void showAge(int age)
	{
		System.out.println("The age of the Person is: "+age);
	}
}
class Human5 extends Human4
{
	public void showAdress(String adress)
	{
		System.out.println("The person Adress is: "+adress);
	}
	void displayCity(String city)
	{
		System.out.println("The city name is: "+city);
	}
}
public class MultipleInterface2 {
	public static void main(String[] args) {
		Human5 obj=new Human5();
		obj.showvVillageName("KOLAVI");
		obj.showname("BASAVARAJ");
		obj.showAge(25);
		obj.showAdress(" 7th main Vijayanagar");
		obj.displayCity("GOKAK");
	}

}
