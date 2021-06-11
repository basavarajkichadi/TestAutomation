package com.sgtesting.methodreturn;

class character1
{
	char[][] character()
	{
		char C[][]= {{'A','B'},{'C','D'}};
		return C;
	}
}

public class Character2D {

	public static void main(String[] args) {
		character1 obj=new character1();
		char D[][]=obj.character();

		for(int i=0;i<D.length;i++)
		{
			for(int j=0;j<D[i].length;j++)
			{
				System.out.print(D[i][j]+" ");
			}
			System.out.println();
		}



	}

}
