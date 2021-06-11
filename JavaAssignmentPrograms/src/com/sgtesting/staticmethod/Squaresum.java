package com.sgtesting.staticmethod;
class Square
{
	static int Square1()
	{
		int res=0;
		for(int i=1;i<=10;i++)
		{
			int s=i*i;
			res=res+s;	
		}
		return res;
	}
}
public class Squaresum {
	
	public static void main(String[] args) {
		int c=Square.Square1();
		System.out.println(c);
	}
}
