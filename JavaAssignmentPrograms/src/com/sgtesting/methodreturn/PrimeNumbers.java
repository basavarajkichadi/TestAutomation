package com.sgtesting.methodreturn;

class PrimeNumber50
{

	int[] prime50(int num)
	{

		int size=0;
		for(int i=2;i<num;i++)
		{
			boolean isprime=true;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime)
			{
				size=size+1;
			}
		}
		int c[]=new int[size];
		int k=0;
		for(int p=2;p<num;p++)
		{
			boolean isprime=true;
			for(int q=2;q<p;q++)
			{
				if(p%q==0)
				{
					isprime=false;
					break;
				}
			}
			if(isprime)
			{
				
				c[k]=p;
				k=k+1;
			}
		}
		return c;
	}
}

public class PrimeNumbers {

	public static void main(String[] args) {
		PrimeNumber50 obj=new PrimeNumber50();
		int d[]=obj.prime50(50);
		System.out.print("1"+" ");
		for(int i=0;i<d.length;i++)
		{
			System.out.print(d[i]+" ");
		}

	}

}
