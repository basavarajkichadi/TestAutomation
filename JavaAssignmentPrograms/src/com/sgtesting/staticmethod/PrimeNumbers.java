package com.sgtesting.staticmethod;
class Prime
{
	static boolean Prime1(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag++;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}

	static int [] display()
	{
		int size=0;
		for(int k=1;k<=50;k++)
		{
			if(Prime1(k)==true)
			{
				size++;
			}
		}
		int a[]=new int [size];
		int p=0;
		for(int k=1;k<=50;k++)
		{
			if(Prime1(k)==true)
			{
				a[p]=k;
				p++;
			}
		}
		return a;
	}
}

public class PrimeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]=Prime.display();
		for(int z=0;z<c.length;z++)
		{
			System.out.println(c[z]);
		}

	}

}
