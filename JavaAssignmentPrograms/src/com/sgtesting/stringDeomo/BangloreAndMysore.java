package com.sgtesting.stringDeomo;

public class BangloreAndMysore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Bangalore and Mysore";
		String str1[]=str.split(" ");
		for(int i=str1.length-1;i>=0;i--)
		{
			System.out.println(str1[i]+" ");
		}

	}

}
