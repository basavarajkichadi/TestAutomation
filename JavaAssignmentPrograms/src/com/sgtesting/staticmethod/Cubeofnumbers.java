package com.sgtesting.staticmethod;
class Cube
{
	static int[] Cube1()
	{
		int size=0;
		for(int i=1;i<=10;i++)
		{
			size++;
		}
		int a[]=new int[size];
		int k=0;
		for(int j=1;j<=10;j++)
		{
			a[k]=j*j*j;
			k++;
		}
		return a;
	}
}

public class Cubeofnumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c[]=Cube.Cube1();
		for(int z=c.length-1;z>=0;z--)
		{
			System.out.println(c[z]);
		}

	}

}
