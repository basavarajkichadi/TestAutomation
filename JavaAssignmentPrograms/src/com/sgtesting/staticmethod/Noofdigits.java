package com.sgtesting.staticmethod;
class Digit
{
	static int Digit1()
	{
		int num=1234;
		int p=0;
		for(int i=num;i>0;i=i/10)
		{
			p++;
		}
		return p;
	}
}

public class Noofdigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=Digit.Digit1();
		System.out.println(c);

	}

}
