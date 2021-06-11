package com.satesting.inheretance;

class Maths
{
	void addition(int a,int b)
	{
		System.out.println("Addition  "+(a+b));
	}
}
class Maths1 extends Maths
{
	void substraction(int a, int b)
	{
		System.out.println("Sunstraction "+(a-b));
	}
}
public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Maths1 obj=new Maths1();
		obj.addition(20, 10);
		obj.substraction(50, 20);




	}

}
