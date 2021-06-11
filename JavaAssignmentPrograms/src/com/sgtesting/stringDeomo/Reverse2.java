package com.sgtesting.stringDeomo;

public class Reverse2 {

	public static void main(String[] args) {
		String b="Akilkumar";
		String rev="";
		char ch[]=b.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+b.charAt(i);
		}
		System.out.println("The Revered String is: "+rev);

	}

}
