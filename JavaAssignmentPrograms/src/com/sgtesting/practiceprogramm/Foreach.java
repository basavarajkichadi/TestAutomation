package com.sgtesting.practiceprogramm;
class Prime
{
	boolean isprime(int n)
	{
		int	flag=0;
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
	int[] displayPrime()
	{
		int size=0;
		for(int k=1;k<=50;k++)
		{
			if(isprime(k)==true)
			{
				size++;
			}
		}
		int a[]=new int[size];
		int b=0;
		for(int k=1;k<=50;k++)
		{
			if(isprime(k)==true)
			{
				a[b]=k;
				b++;
			}
		}
		return a;
	}
}
public class Foreach {

	public static void main(String[] args) {
		Prime obj=new Prime();
		int d[]=obj.displayPrime();
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[0]);
		}
	}
}


