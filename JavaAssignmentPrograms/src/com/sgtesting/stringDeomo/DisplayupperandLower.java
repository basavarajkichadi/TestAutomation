package com.sgtesting.stringDeomo;

public class DisplayupperandLower {

	public static void main(String[] args) {
		String s="BeLagaVI";
		int length=s.length();
		for(int i=0;i<length-1;i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z')
			{
				System.out.println("the lowercase letter is in given string:"+c);
			}
			else if(c>='A' && c<='Z')
			{
				System.out.println("the uppercase letter is in given string:"+c);
			}


		}
	}
}




