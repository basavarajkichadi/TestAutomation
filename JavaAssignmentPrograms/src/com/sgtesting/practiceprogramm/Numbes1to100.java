package com.sgtesting.practiceprogramm;

class Number
{
	int Number1()
	{
		int c=0;
		for(int i=1;i<=100;i++)
		{
			System.out.println(i);
		}
		return c;
	}
}

public class Numbes1to100 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Number obj=new Number();
		int d=obj.Number1();
		System.out.println(d);
		

	}

}
