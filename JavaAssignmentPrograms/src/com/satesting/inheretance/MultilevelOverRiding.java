package com.satesting.inheretance;
class Method1
{
	void addition(int x,int y)
	{
		System.out.println("Addition Result :"+(x+y));
	}
}
class Method2 extends Method1
{
	Method2(int x,int y)
	{
		super.addition(x, y);
	}
	
	void addition(int a,int b)
	{
		System.out.println("SubstractionResult :"+(a-b));
	}
}
class Method3 extends Method2
{
	Method3(int x,int y,int c,int d)
	{
		super(x,y);
		super.addition(c, d);
	}
	void addition(int a,int b)
	{		
		System.out.println("Multiplication Result :"+(a*b));
	}
}
public class MultilevelOverRiding {

	public static void main(String[] args) {

		Method3 obj=new Method3(20,30,120,20);
		//obj.addition(10, 20);
		
		
	}

}

