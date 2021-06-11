package com.sgtesting.stringDeomo;

public class ConsonentCount {

	public static void main(String[] args) {
		String s="Pavan";
		int vcount=0;int Ccount=0;
		//s=s.toLowerCase();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
			{
				vcount++;
			}
			else
			{
				Ccount++;
			}
		}
		System.out.println("The Number of Consonent in Given String is: "+Ccount);

	}
}


