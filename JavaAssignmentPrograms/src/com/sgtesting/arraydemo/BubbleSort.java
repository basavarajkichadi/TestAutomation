package com.sgtesting.arraydemo;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int a[] = {1,5,4,7,9,6,1,3};
		int b[]=new int[a.length];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i] > a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;

				}
				
			}
			b[k]=a[i];
			k++;
		}
		System.out.println(Arrays.toString(b));
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==b[i])
			{
				System.out.println("The array is in sorted order");
			}
			else
			{
				System.out.println("The array is not in sorted order");
			}
		}

	}
}
