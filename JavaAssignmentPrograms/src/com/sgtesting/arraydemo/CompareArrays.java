package com.sgtesting.arraydemo;

public class CompareArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {1,2,3,4};
		int[] b= {1,2,3,5};
		if(equals(a,b)==true)
		{	
			System.out.println("same Array");
		}else
		{
			System.out.println("Different array");
		}
	}
	public static boolean equals(int[] a,int[] b)
	{
		if(a.length!=b.length)
		{
			return false;
		}
		for(int i=0;i<a.length;i++)
		{
			if(a[i]!=b[i])
			{
				return false;
			}
		}
		return true;
	}

}
