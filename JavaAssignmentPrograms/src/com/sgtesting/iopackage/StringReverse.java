package com.sgtesting.iopackage;

public class StringReverse {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String b="Akilkumar";
		String rev="";
		char ch[]=b.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+b.charAt(i);
		}
		System.out.println("The given String is: "+b);
		System.out.println();
		System.out.println("The Revered String is: "+rev);
	}
}


