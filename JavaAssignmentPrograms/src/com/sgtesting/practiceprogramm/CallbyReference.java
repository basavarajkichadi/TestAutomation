package com.sgtesting.practiceprogramm;
class callbyref
{
	int a,b;
	void calculatae(callbyref obj)
	{
		obj.a+=100;
		obj.b*=5;
		System.out.println("Within method value of a"+a);
		System.out.println("Within method value of b"+b);
	}
}

public class CallbyReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		callbyref obj=new callbyref();
		obj.a=10; obj.b=5;
		System.out.println("Before execution of method value of a"+obj.a);
		System.out.println("Before execution of method value of b"+obj.b);
		
		obj.calculatae(obj);
		
		System.out.println("After execution of method value of a"+obj.a);
		System.out.println("After execution of method value of b"+obj.b);
		

	}

}
