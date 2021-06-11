package com.sgtesting.methodreturn;
class primenumber1
{
	boolean primenumber3(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag++;
				break;
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
}

public class Primenumber2 {

	public static void main(String[] args) {
		primenumber1 obj=new primenumber1();
		int size=0;
		for(int k=1;k<=50;k++)
		{
			if(obj.primenumber3(k)==true)
			{
				size++;
			}
		}

		int a[]=new int[size];
		int i=0;
		for(int k=1;k<=50;k++)
		{
			if(obj.primenumber3(k)==true)
			{
				a[i]=k;
				i++;
				//	System.out.println(k);
			}
			//System.out.print(a[i]+" ");
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.print(a[j]+" ");
		}


	}

}
