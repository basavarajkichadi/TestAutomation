package com.sgtesting.practiceprogramm;
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
	int [] display()
	{
		int size=0;
		for(int k=1;k<=50;k++)
		{
			if(primenumber3(k)==true)
			{
				size++;
			}
		}
		int a[]=new int [size];
			int p=0;
		for(int k=1;k<=50;k++)
		{
			if(primenumber3(k)==true)
			{
				a[p]=k;
				p++;
			}
		}
		return a;
	}
}
	public class Primenumber {
		public static void main(String[] args) {
			primenumber1 obj=new primenumber1();
			
			int c[]=obj.display();
			for(int z=0;z<c.length;z++)
			{
				System.out.println(c[z]+"");
			}
		}
	}
