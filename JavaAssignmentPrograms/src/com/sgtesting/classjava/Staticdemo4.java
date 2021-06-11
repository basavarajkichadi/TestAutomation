package com.sgtesting.classjava;
class demo4
{
	static void add(int x, int y)
	{
		demo4 obj=new demo4();
		obj.multi(10,30);
		System.out.println("addition "+(x+y));
	}
	  void multi(int x,int y)
	{
		//add(20,30);
		System.out.println("multiplication "+(x*y));
	}	
}
public class Staticdemo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo4.add(10,20);
		demo4 obj1=new demo4();
		obj1.multi(20, 30);
		obj1.multi(20, 2);
	}
	
}
