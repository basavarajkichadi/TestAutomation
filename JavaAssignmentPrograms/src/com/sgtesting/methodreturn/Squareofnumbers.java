package com.sgtesting.methodreturn;
class Square
{
	int[] Square2()
	{
		int size=0;
		for (int i=1;i<=10;i++)
		{
			size++;
		}
		System.out.println("the size of array is "+size);
		int a[]=new int[size];
		int k=0;
		for (int i=1;i<=10;i++)
		{
			a[k]=i*i;
			k++;
		}
		return a;
	}
}

public class Squareofnumbers {

	public static void main(String[] args) {
		Square obj=new Square();
		int c[]=obj.Square2();

		for (int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
