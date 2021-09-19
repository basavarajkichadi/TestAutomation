package com.sgtesting.practice;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try
		{
			String str="Basavaraj";
			char[] b=str.toCharArray();
			for(int i=b.length-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
			
			
		}catch(Exception e)
		{
			System.out.println(e);
		}

	}

}
