package com.sgtesting.practiceprogramm;
class callbyvalue3
{
	int a,b;
	void calculate()
	{
		a+=100;
		b*=5;
		System.out.println("within method a value "+a);
		System.out.println("within method b value "+b);
	}
	
}
public class CallByvalue2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;int b=5;
		System.out.println("before execution of method value of a "+a);
		System.out.println("before execution of method value of b "+b);
		
		callbyvalue3 obj=new callbyvalue3();
		obj.calculate();
		System.out.println("After execution of method value of a "+a);
		System.out.println("After execution of method value of b "+b);
	}
}
