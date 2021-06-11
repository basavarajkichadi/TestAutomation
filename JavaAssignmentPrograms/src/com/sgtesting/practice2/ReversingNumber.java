package com.sgtesting.practice2;
import java.util.Scanner;
public class ReversingNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=sc.nextInt();
		// TODO Auto-generated method stub
		int rev=0;
		for(int i=num;i>0;i=i/10)
		{
			int rem=i%10;
			rev=rev*10+rem;
		}
			if(num==rev)
			{
				System.out.println("The given number is pallindrome");
			}
			else
			{
				System.out.println("the given number is not pallindrome");
			}
		
		System.out.println("The reversed Number is "+rev);

	}
}
