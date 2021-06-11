package com.sgtesting.staticmethod;
class Revesre
{
	static int Reverse1()
	{
		int num=1236;
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
		return rev;
	}
}

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=Revesre.Reverse1();
		System.out.println(c);

	}

}
