package com.sgtesting.stringDeomo;

public class DeleteEachOccurenceofDay {

	public static void main(String[] args) {
		String s="SUNDAYMONDAYTUESDAYWEDNESDAYTHURSDAYFRIDAYSATURDAY";
		System.out.println(s);
		System.out.println();
		String a[]=s.split("DAY");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}

	}

}
