package com.satesting.inheretance;
class Test
{
	void addition(int a, int b)
	{
		System.out.println("Addition "+(a+b));
	}
}
class Test1 extends Test
{
	void Substraction(int a, int b)
	{
		System.out.println("Substraction"+(a-b));
	}
}
class Test2 extends Test
{
	void Multilplication(int a,int b)
	{
		System.out.println("multiplication"+(a*b));
	}
}
class Test3 extends Test2
{
	void Division(int a,int b)
	{
		System.out.println("Division"+(a/b));
	}
}

public class HybridInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test3 obj=new Test3();
		obj.addition(10, 20);
		obj.Multilplication(10, 5);
		obj.Division(10, 2);

		Test1 obj1=new Test1();
		obj1.addition(10, 20);
		obj1.Substraction(10, 20);


	}

}
