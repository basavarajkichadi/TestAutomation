package com.sgtesting.streamassignments;

public class Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=69;
		for(int i=1;i<=3;i++)
		{
			for(int j=1;j<=3;j++)
			{ 
				char c=(char)a;
				a++;
				System.out.print(c+ " ");
			}
			System.out.println();
		}
	}
}

