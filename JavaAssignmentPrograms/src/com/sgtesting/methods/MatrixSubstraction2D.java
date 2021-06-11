package com.sgtesting.methods;
class Substraction1
{
	void Substraction2(int a[][],int b[][])
	{
		int c[][]=new int[3][3];
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++)
			{
				c[i][j]=a[i][j]-b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

	}
}

		public class MatrixSubstraction2D {

			public static void main(String[] args) {
				Substraction1 sub=new Substraction1();

				int a[][]= {{10,20},{10,20}};
				int b[][]= {{20,30},{10,20}};
				sub.Substraction2(a, b);

			}

		}
