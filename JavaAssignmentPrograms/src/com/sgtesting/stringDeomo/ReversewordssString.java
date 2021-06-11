package com.sgtesting.stringDeomo;

public class ReversewordssString {

	public static void main(String[] args) {
		String s="Bengaluru and Mysore";
		String result="";
		String a[]=s.split(" ");		//1D String type array a[]
		
		System.out.println("Entered string is : ");
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		for(int i=a.length-1;i>=0;i--)
		{
			result=result+a[i]+" ";
		}
		System.out.println("Required output is: ");
		System.out.println(result);

	}

}
