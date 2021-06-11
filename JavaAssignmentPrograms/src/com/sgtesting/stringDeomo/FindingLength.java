package com.sgtesting.stringDeomo;
public class FindingLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="testing";
		char ch[]=str.toCharArray();
		int z=0;
		for(int i=0;i<ch.length;i++)
		{
			z++;
		}
		System.out.println(z);
	}
}

