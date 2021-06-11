package com.sgtesting.arraydemo;

import java.util.Arrays;

class Addition
{
	static int[][] matrixAddition(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[0].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;

	}
}

public class Additionof2array {
	public static void main(String[] args) {

		int a[][]= {{1,2},{3,4}};
		int b[][]= {{1,2},{2,3}};
		int d[][]=Addition.matrixAddition(a, b);
		System.out.println(Arrays.deepToString(d));

	}
}

