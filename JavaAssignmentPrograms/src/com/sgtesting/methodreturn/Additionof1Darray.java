package com.sgtesting.methodreturn;
class Addition
{
	int[] getarray(int a[],int b[])
	{
		int z[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			z[i]=a[i]+b[i];
		}
		return z;	
	}

}

public class Additionof1Darray {

	public static void main(String[] args) {
		Addition obj=new Addition();
		int  a[]= {1,2,3,4};
		int b[]= {5,6,7,8};
		int c[]=obj.getarray(a, b);
		System.out.println("The First matrix is ");

		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("The second matrix is ");
		for(int j=0;j<a.length;j++)
		{
			System.out.println(+b[j]);
		}
		System.out.println("Addition of two matrix is ");
		for(int i=0;i<c.length;i++) 
		{
			System.out.println(c[i]+" ");
		}

	}

}
