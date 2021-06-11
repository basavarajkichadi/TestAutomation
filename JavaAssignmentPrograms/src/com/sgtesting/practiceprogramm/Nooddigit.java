package com.sgtesting.practiceprogramm;

import java.util.Scanner;

public class Nooddigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int p=0;
		int i=n;
		
		while(i>0)
		{
			i=i/10;
			p++;
		}
		System.out.println(p);

	}

}
