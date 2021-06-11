package com.sgtesting.pattern;

public class PyramidPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=4;i++)
		{
			for(int k=4;k>=i;k--)
			{
				System.out.print(" ");
			}

			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			for(int z=2;z<=i;z++)
			{
				System.out.print("*");
			}
			System.out.println();
	
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int w=4;w>=i;w--)
			{
				System.out.print("*");
			}
			for(int z=3;z>=i;z--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}

