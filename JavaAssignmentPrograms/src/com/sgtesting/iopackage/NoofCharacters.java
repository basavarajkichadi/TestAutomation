package com.sgtesting.iopackage;

public class NoofCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Basavaraj";
		int count=0;
		int length=s.length();
		for(int i=0;i<length;i++)
		{
			char c=s.charAt(i);
			if(c>='a' && c<='z' || c>='A' && c<='Z')
			{
				count++;
			}
		}
		System.out.println("The Number of characters in Given String are: "+count);
	}
}