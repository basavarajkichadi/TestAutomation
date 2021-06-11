package com.sgtesting.iopackage;

public class StringImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str=new String("Basavaraj");
		System.out.println(str);
		str.concat("Prabhakar");
		System.out.println(str);
		str.concat("Pavan");
		System.out.println(str);
		//The String class is immutable because we cannot modify on same location

	}
}

