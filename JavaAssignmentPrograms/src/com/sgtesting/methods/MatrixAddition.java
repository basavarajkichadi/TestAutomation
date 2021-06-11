package com.sgtesting.methods;
class sample
{
	void addition(int a[],int b[])
	{
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+b[i]);
		}
		
	}
}
public class MatrixAddition {

	public static void main(String[] args) {
		System.out.println("the addition of two matrix is:");
		sample s=new sample();
		int a[]= {10,20,30};
		int b[]= {20,30,40};
		s.addition(a, b);

	}

}
