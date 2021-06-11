package com.satesting.inheretance;
class SampleCity1
{
	void showCity(String name)
	{
		System.out.println("The City Name in super Class :"+name);
	}
}
class SampleCity2 extends SampleCity1
{
	
	void showCity(String name)
	{
		super.showCity(name);
		System.out.println("The City Name in Sub Class :"+name);
	}
}
class SampleCity3 extends SampleCity1
{
	
	void showCity(String name)
	{
		super.showCity(name);
		System.out.println("The City Name in second Subclass is :"+name);
	}
}
class SampleCity4 extends SampleCity3
{
	
}
public class Demo {
	public static void main(String[] args) {
		SampleCity3 obj=new SampleCity3();
		obj.showCity("gadag");
	}
}



