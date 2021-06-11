
package com.satesting.inheretance;
class Apple
{
	Apple(String name,int price)
	{
		System.out.println("NAME is: "+name);
		System.out.println("PRICE IS: "+price);
	}
	void display(String adress)
	{
		System.out.println("The adress in super class is: "+adress);
	}
}
class Apple1 extends Apple
{
	Apple1(String name,int price,String adress)
	{
		super(name,price);
		super.display(adress);
	}
	void display(String adress)
	{
		System.out.println("THE adress in first subclass is "+adress);
	}
}
class Apple2 extends Apple1
{
	Apple2(String name,int rate,String adress)
	{
		super(name,rate,adress);
		super.display(adress);
	}
	void display(String adress)
	{
		System.out.println("THE adress in second subclass is "+adress);
	}
}
public class Superandsubparameter {

	public static void main(String[] args) {
		Apple2 obj=new Apple2("Apple",25000,"BELAGAVI");
		obj.display("KOLAVUI");

	}

}
