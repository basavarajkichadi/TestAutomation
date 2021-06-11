package com.sgtesting.methods;

class characterMatrix
{
	void display(char a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for (int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();					
		}
	}
}



public class Character2D {

	public static void main(String[] args) {
		characterMatrix obj=new characterMatrix();
		char a[][]= {{'a','b'},{'c','d'}};
		obj.display(a);

	}

}
