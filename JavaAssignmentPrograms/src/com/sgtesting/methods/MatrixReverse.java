package com.sgtesting.methods;
class ReverseMatrix
{
	void display(int a[][])
	{
		for(int i=a.length-1;i>=0;i--)
		{
			for (int j=a[i].length-1;j>=0;j--)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();					
		}
	}
}
public class MatrixReverse {

	public static void main(String[] args) {
		ReverseMatrix obj=new ReverseMatrix();
		int a[][]= {{1,2},{2,3}};
		obj.display(a);
	}

}
