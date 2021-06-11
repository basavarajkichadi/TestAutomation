package com.sgtesting.practiceprogramm;
class callbyvalue
{
	void calculate(int a,int b)
	{
		a+=100;
		b*=5;
		System.out.println("within method a value "+a);
		System.out.println("within method b value "+b);
	}
	
}
public class Callbyvaluedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=10;int b=5;
		System.out.println("before execution of method value of a "+a);
		System.out.println("before execution of method value of b "+b);
		
		callbyvalue obj=new callbyvalue();
		obj.calculate(a, b);
		System.out.println("After execution of method value of a "+a);
		System.out.println("After execution of method value of b "+b);
		
		
	}

}
