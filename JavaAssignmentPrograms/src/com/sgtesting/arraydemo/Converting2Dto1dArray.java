package com.sgtesting.arraydemo;

import java.util.Arrays;

public class Converting2Dto1dArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2},{3,4}};
		int row=a.length;
		int col=a[0].length;
		int res[]=new int[row*col];
		int k=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				res[k]=a[i][j];
				k++;
			}
		}
		for(int kk:res)
		{
			System.out.println(kk);
		}
		System.out.println(Arrays.deepToString(a));
	}

}
