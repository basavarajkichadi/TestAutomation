package com.sgtesting.methods;

class Example

{
	String Name(String b)
	{
		return(b);
	}

}

public class Returnmethod {

	public static void main(String[] args) {
		Example obj=new  Example();
		String	a= obj.Name("Basu");
		System.out.println(a);

	}

}
