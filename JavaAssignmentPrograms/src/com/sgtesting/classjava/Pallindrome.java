package com.sgtesting.classjava;
import java.util.Scanner;
public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int reverse=0;
		for(int i=num;i>0;i=i/10)
		{
			int remainder=i%10;
			reverse=(reverse*10)+remainder;
		}
		if(reverse==num) 
		{
			System.out.println(num +" is pallindrome");
		}
			else
			{
				System.out.println(num+" is not pallindrome");
			}

	}

}
