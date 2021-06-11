package com.sgtesting.methodreturn;

class Result1
{
	int[] Result2(int n)
	{
		int b[]=new int[10];
		int k=0;
		for(int i=10;i>0;i--)
		{
			b[k]=n*i;
			k++;
		}
		return b;
	}
}

public class Resultof7thtable {

	public static void main(String[] args) {
		Result1 obj=new Result1();
		int c[]=obj.Result2(7);
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		

	}

}
