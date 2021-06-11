package com.sgtesting.staticmethod;
class matrix
{
	static int[][] matrix1(int x[][])
	{
		int c[][]=new int[x.length][x[0].length];
		for(int i=0;i<x.length;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				c[i][j]=x[j][i];
			}
		}
		return c;
	}
}
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]= {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("the Given matrix is ");

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
System.out.println("The Transpose of given matrix is");	
		int d[][]=matrix.matrix1(a);
		for(int kk[]:d)
		{
			for(int z:kk)
			{
				System.out.print(z+" ");
			}
			System.out.println();
		}
		

	}

}
