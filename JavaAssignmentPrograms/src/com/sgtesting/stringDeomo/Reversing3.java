package com.sgtesting.stringDeomo;

public class Reversing3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
			String s="TESTER";
		    char p;
			char ch[]=s.toCharArray();
			
			for(int i=ch.length-1;i>=0;i--)
			{
				p=ch[i];
				System.out.print(p);
			}

	}

}
