package com.sgtesting.practiceprogramm;
class callbyref2
{
	int a,b;
	void calculatae(callbyref2 obj)
	{
		a+=100;
		b*=10;
		System.out.println("Within method value of a"+a);
		System.out.println("Within method value of b "+b);
	}
}

public class Callbyreference2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		callbyref2 obj=new callbyref2();
		int a=10;int b=5;
		System.out.println("Before execution of method value of a"+a);
		System.out.println("Before execution of method value of b"+b);
		
		obj.calculatae(obj);
		
		System.out.println("After execution of method value of a"+a);
		System.out.println("After execution of method value of b"+b);

	}

}
