package com.satesting.inheretance;
class Calculate1
{
	Calculate1(int a,int b)
	{
		System.out.println("Addition of Two Numbers is "+(a+b));
	}
	Calculate1(int a,int b,int c)
	{
		System.out.println("Addition of Three Numbres is "+(a+b+c));
	}
}
class Calculate2 extends Calculate1
{
	Calculate2(int a,int b)
	{
		super(a,b);
		System.out.println("Addition of two Numbers in First Subclass is: "+(a+b));
	}
	Calculate2(int a,int b,int c)
	{
		super(a,b,c);
		System.out.println("Addition of three Numbers in First Subclass is: "+(a+b+c));
	}
	void displayAge(int age)
	{
		System.out.println("The age is "+age);
	}
}
class Calculate3 extends Calculate1
{
	Calculate3(int a,int b)
	{
		super(a,b);
		System.out.println("Addition of two Numbers in Second Subclass is: "+(a+b));
	}
	Calculate3(int a,int b,int c)
	{
		super(a,b,c);
		System.out.println("Addition of three Numbers in Second Subclass is "+(a+b+c));
	}
}
class Calculate4 extends Calculate3
{
	Calculate4(int a,int b)
	{
		super(a,b);
		System.out.println("Addition of two Numbers in Third Subclass is: "+(a+b));
	}
	Calculate4(int a,int b,int c)
	{
		super(a,b,c);
		System.out.println("Addition of three Numbers in Third Subclass is "+(a+b+c));
	}
}

public class HybridConstructorOverloading {

	public static void main(String[] args) {
		Calculate4 obj=new Calculate4(20,30);
		Calculate4 obj1=new Calculate4(20,20,50);
		
		Calculate2 obj2=new Calculate2(10,20);
		obj2.displayAge(25);
		Calculate2 obj3=new Calculate2(10,20,30);
		
		//do we need to write sop in all the classes when we are overloding constructor,method
		
		
		
		

	}

}
