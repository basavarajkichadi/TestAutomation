package arrays;

import java.util.Arrays;

public class DeclaringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//int arr[][]=new int[5][3];
		//System.out.println(arr[1].length);
		int arr[][]= {{1,2},{3,4},{5,6}};
		char ba[]= {'a','b'};
		int a[]=new int[4];
		a[0]=0; a[1]=1;a[2]=2;a[3]=3;
		//Reading array
		for(int i=0;i<a.length;i++)
		{
			//System.out.print(a[i]+" ");
		}
		//Reading array in Reverse order
		for(int i=a.length-1;i>=0;i--)
		{
			//System.out.print(a[i]+" ");
		}
		//reading 2D array
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		
		//reading using for loop
		for(int val[]:arr)
		{
			for(int val1:val)
			{
				//System.out.print(val1+" ");
			}
			//System.out.println();
		}
		int i=0;
		while(i<arr.length)
		{
			int j=0;
			while(j<arr[i].length)
			{
				System.out.print(arr[i][j]+" ");
				j++;
			}
			System.out.println();
			i++;
		}
		System.out.println();
		
		int k=0;
		do
		{
			int l=0;
			do
			{
				System.out.print(arr[k][l]+" ");
				l++;
			}while(l<arr[k].length);
			k++;
			System.out.println();
		}while(k<arr.length);
			
			
			
			
			
			
			
			
		
		
	
	}

}
