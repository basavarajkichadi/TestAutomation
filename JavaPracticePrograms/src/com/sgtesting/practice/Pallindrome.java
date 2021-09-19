package com.sgtesting.practice;

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter The number");
		int num=sc.nextInt();
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		System.out.println(rev);
		sc.close();
	}


}


