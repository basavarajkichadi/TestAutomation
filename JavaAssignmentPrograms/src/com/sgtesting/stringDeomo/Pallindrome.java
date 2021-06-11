package com.sgtesting.stringDeomo;

public class Pallindrome {

	public static void main(String[] args) {
		String s="GADAG";
		String rev="";
		int length=s.length();
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);

		}
		System.out.println(rev);

		if(s.equals(rev))
		{
			System.out.println("Given String is Pallindrome");
		}
		else
		{
			System.out.println("Given String is not Pallindrome");
		}

	}
}
