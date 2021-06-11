package com.sgtesting.classjava;

import java.util.Scanner;

public class Positive {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		System.out.println("given integer is:"+a);
		int i=1;
		if(i>0)
		{
			System.out.println("the given number is positive");
		}
		else
		{
			System.out.println("the given number is negative");
			
		}
		sc.close();

	}

}
