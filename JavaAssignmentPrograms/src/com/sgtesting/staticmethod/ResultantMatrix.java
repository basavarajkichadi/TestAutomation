package com.sgtesting.staticmethod;
class Result
{
	static int[] Result1(int a[],int b[])
	{

		int a_length=a.length;
		int b_length=b.length;
		int c_length=a.length+b.length;
		int c[]=new int[c_length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++)
		{
			c[a.length+j]=b[j];
		}
		return c;

	}
}

	public class ResultantMatrix {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int a[]= {10,20,30};
			int b[]= {50,60,70,80};
			int d[]= Result.Result1(a, b);
			for(int kk:d)
			{
				System.out.println(kk);
			}

		}

	}
