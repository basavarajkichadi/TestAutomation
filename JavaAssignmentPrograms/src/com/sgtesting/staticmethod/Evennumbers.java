package com.sgtesting.staticmethod;
class Evendemo
{
	static int[] Evendemo1()
	{
		int size=0;
		for(int i=40;i<=60;i++)
		{
			if(i%2==0)
			{
				size++;
			}
		}
		int a[]=new int[size];
		int k=0;
		for(int j=40;j<=60;j++)
		{
			if(j%2==0)
			{
				a[k]=j;
				k++;
			}
		}
		return a;
	}
}

public class Evennumbers {

	public static void main(String[] args) {
	int b[]=Evendemo.Evendemo1();
		for(int z=0;z<b.length;z++)
		{
			System.out.println(b[z]);
		}

	}

}
