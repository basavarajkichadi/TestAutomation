package com.sgtesting.methods;
class substraction
{
	void substraction1(int arr[],int b[])
	{
		for(int i=0;i<arr.length;i++)
		{
		System.out.println(arr[i]-b[i]);
		}
	}
}

public class MatrixSubstraction {

	public static void main(String[] args) {
		
		substraction sub=new substraction();
		int a[]= {70,60,50};
		int b[]= {40,30,10};
		sub.substraction1(a,b);
	}

}
