package com.sgtesting.methodreturn;
class string1
{
	String[][] array(String a[][])
	{
		return a;
	}
}

public class String2D {

	public static void main(String[] args) {
		string1 obj=new string1();
		String a[][]= {{"Basu","Pavan"},{"Varun","gopal"}};
	
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
