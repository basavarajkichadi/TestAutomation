package com.sgtesting.methods;
import java.util.Scanner;
class pnumber
{
	void displayNumber(int n)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		n=sc.nextInt();
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag++;
			}

		}
		if(flag==0) 
		{
			System.out.println(+n+" is prime number");
		}
		else
		{
			System.out.println(+n+" is not prime number");
		}
		sc.close();
	}
}
public class Primenumber {	
	public static void main(String[] args) {
		pnumber obj=new pnumber();
		int n=0;
		obj.displayNumber(n);
	}

}
