package com.sgtesting.stringDeomo;

public class UpperLowerCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				String s="PaVaN";
				char ch[]=s.toCharArray();
				int cap=0;
				int sml=0;
				for(int i=0;i<ch.length;i++)
				{
					char c=s.charAt(i);
					if(c>='a' && c<='z')
					{
						sml++;
					}
					else if(c>='A' && c<='Z')
					{
						cap++;
					}
				}
				System.out.println("the uppercase are in given string:"+cap);
				System.out.println("the Lowercase are in given string:"+sml);
			}
		}





