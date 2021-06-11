package com.sgtesting.arraydemo;

public class ArrayLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,5,6,7};
		int count =0;
		
		for(int kk:a)
		{
			count++;
		}
		System.out.println(count);
		for(int i=0;i<a.length;i++)
		{
			count++;
		}
		System.out.println("Size of the array is: "+count);
	}

}
