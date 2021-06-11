package com.sgtesting.stringDeomo;

public class InsertcammaAfterEachday {

	public static void main(String[] args) {
		String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		String newString="";
		for(int i=0;i<s.length();i++)
		{
			newString=newString+s.charAt(i);
			if(s.charAt(i)=='Y')
			{
				newString=newString+",";
			}	
		}
		System.out.println(newString);

	}

}
