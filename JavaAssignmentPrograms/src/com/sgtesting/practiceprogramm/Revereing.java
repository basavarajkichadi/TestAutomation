package com.sgtesting.practiceprogramm;
import java.util.Scanner;

public class Revereing {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int rev=0;
		int i=n;
		while(i>0)
		{
			int rem=i%10;
			rev=(rev*10)+rem;
			i=i/10;
		}
		System.out.println(rev);
		
sc.close();
	}

}
