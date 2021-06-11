package com.sgtesting.stringDeomo;

public class ReveseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Basavaraj";
		String rev="";
		//int length=s.length();
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);

		}

		System.out.println("Reverse of the given string is: "+rev);
	}

}




