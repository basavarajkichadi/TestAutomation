package com.sgtesting.practice2;
import java.util.Scanner;
class Pnumber
{
	boolean isprime(int n)
	{
		int flag=0;
		for(int i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag++;
				break;
			}
		}
		if(flag==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	void  primeNumbers(int n,int k)
	{
		for(int j=n;j<=k;j++)
		{
			if(isprime(j)==true)
			{
				System.out.println(j);
			}
		}
	}
}
public class PrimeNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First number");
		int n=sc.nextInt();
		System.out.println("Enter The second Number");
		int k=sc.nextInt();
		System.out.println("The Prime Numbers Between "+n+" and "+k+" Are :");
		Pnumber obj=new Pnumber();
		obj.primeNumbers(n,k);


	}

}
