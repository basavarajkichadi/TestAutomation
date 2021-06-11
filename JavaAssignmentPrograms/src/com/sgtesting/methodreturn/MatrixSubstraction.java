package com.sgtesting.methodreturn;
class Substraction
{
	int[][]  Substraction()
	{
		int c[][]=new int[2][3];
		int a[][]= {{1,2,3},{2,3,4}};
		int b[][]= {{1,2,3},{1,2,3}};

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]-b[i][j];

			}

		}
		return c;
	}
}

public class MatrixSubstraction {

	public static void main(String[] args) {
		Substraction obj=new Substraction();
		int c[][]=obj.Substraction();
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c[i].length;j++)
			{
				System.out.print(c[i][j]+" ");

			}
			System.out.println();

		}


	}

}
