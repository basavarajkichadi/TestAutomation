package stringdemo;

import java.util.Arrays;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//substring();
		//splitdemo();
		//stringbuilderdemo(new StringBuilder ("good"));
		//Stringreverse();
		StringBuildermutabble();

	}
	static void substring()
	{
		String str="India is great";
		String res=str.substring(4);
		System.out.println(res);
		String res1=str.substring(4, 10);
		System.out.println(res1);
		char ch=str.charAt(1);
		System.out.println(ch);
		int in=str.indexOf("is");
		System.out.println(in);
	}
	
	static void splitdemo()
	{
		String str="Basavaraj Bhimappa Kichadi";
		String arr[]=str.split(" ");
		System.out.println(Arrays.toString(arr));
		
	}
	static void stringbuilderdemo(StringBuilder str)
	{
		StringBuilder str1=str.append(" morning");
		System.out.println(str1);
	}
	static void Stringreverse() {
		StringBuilder str=new StringBuilder("Basavaraj");
		StringBuilder sres=str.reverse();
		System.out.println(sres);
		
	}
	static void StringBuildermutabble() {
		StringBuilder str=new StringBuilder("Basavaraj");
		StringBuilder sres=str.append(" kichadi");
		System.out.println(str);
		System.out.println(sres);
		
		
	}
	
	

}
