package com.sgtesting.staticmethod;
class Squarenum1
{
	static int  Squarenum2()
	{
		int c=0;
		for(int i=1;i<=10;i++)
		{
			 c=i;
		}
		return c;
	}
}

public class SquareNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int d=Squarenum1.Squarenum2();
		System.out.println(d);

	}

}
