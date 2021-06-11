package com.sgtesting.methodreturn;

class Number1
{
	int[] Number2()
	{
		int size=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				size++;
			}
		}
		System.out.println("the size of array is "+size);
		int a[]=new int[size];
		int k=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				a[k]=i;
				k++;
			}

		}
		return a;
	}
}


public class Evennumbers {

	public static void main(String[] args) {
		Number1 obj=new Number1();
		int a[]=obj.Number2();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}


	}

}
