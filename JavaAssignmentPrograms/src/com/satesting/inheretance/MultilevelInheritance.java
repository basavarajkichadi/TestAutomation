package com.satesting.inheretance;
class Java
{
	void addition(int a, int b)
	{
		System.out.println("Addition "+(a+b));
	}
}
class Java1 extends Java
{
	void Substraction(int a, int b)
	{
		System.out.println("Substraction"+(a-b));
	}
}
class Java2 extends Java1
{
	void Multilplication(int a,int b)
	{
		System.out.println("multiplication"+(a*b));
	}
}


public class MultilevelInheritance {

	public static void main(String[] args) {
		Java2 obj=new Java2();
		obj.addition(10, 20);
		obj.Multilplication(10, 20);
		obj.Substraction(10, 5);



	}

}
