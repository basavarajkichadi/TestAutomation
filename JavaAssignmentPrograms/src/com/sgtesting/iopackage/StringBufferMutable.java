package com.sgtesting.iopackage;

public class StringBufferMutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer str=new StringBuffer("Basavaraj");
		System.out.println(str);
		str.append("Prabhakar");
		System.out.println(str);
		str.append("pavan");
		System.out.println(str);
		//The StringBuffer class is mutable because we can modify on same location

	}
}


