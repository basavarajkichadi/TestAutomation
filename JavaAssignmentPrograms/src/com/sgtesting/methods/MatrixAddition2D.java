
package com.sgtesting.methods;
class basu
{
	void addition2(int a[][],int b[][])
	{
		int c[][]=new int[b.length][a[0].length];
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
public class MatrixAddition2D {

	public static void main(String[] args) {
		
		basu add=new basu();

		int a[][]= {{10,20},{10,20}};
		int b[][]= {{20,30},{10,20}};
		add.addition2(a, b);
		
	}

}
