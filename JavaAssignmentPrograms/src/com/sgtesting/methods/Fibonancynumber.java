package com.sgtesting.methods;

class Number1
{
	void numberseries(int n)
	{
		int a=0; int b=1;
		int c;
		System.out.print(a+" "+b+" ");
		for(int i=1;i<=n;i++)
		{
			c=a+b;
			System.out.print(c+" ");
			a=b;
			b=c;
		}
	}
}

public class Fibonancynumber {

	public static void main(String[] args) {
		Number1 obj=new Number1();
		obj.numberseries(8);

	}

}
