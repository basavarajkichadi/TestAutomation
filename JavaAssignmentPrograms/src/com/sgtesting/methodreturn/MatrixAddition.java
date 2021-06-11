package com.sgtesting.methodreturn;
class matadddition
{
	int[][] getarray(int a[][],int b[][])
	{
		int c[][]=new int[a.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		return c;
	}
}
public class MatrixAddition {
	public static void main(String[] args) {
		matadddition obj=new matadddition();
		int a[][]= {{1,2,3},{2,3,4}};
		int b[][]= {{1,2,3},{1,2,3}};
		int c[][]=obj.getarray(a, b);
		for(int zz[]:c)
		{
			for(int d:zz)
			{
				System.out.print(d+" ");
			}
			System.out.println();
		}
	}
}


