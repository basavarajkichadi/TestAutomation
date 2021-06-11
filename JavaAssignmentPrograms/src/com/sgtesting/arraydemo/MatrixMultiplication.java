package com.sgtesting.arraydemo;

public class MatrixMultiplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[][]= {{1,2,3},{4,5,6}};
		int b[][]= {{7,8},{9,10},{11,12}};
		int c[][]=new int[a.length][b[0].length];
		int arows=a.length;
		int acols=a[0].length;
		int brows=b.length;
		int bcols=b[0].length;
		if(arows!=bcols)
		{
			System.out.println("Can't do matrix multiplication");
		}
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				for(int k=0;k<a.length;k++)
				{
					c[i][j]+=a[i][k]*b[k][j];
				}
			}
		}
		for(int kk[]:c)
		{
			for(int zz:kk)
			{
				System.out.print(zz+" ");
			}
			System.out.println();
		}

	}

}
