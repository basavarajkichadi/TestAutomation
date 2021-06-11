package com.sgtesting.classjava;
class Test
{
	 public static Test obj=null;
	private Test()
	{
		System.out.println();
	}
	void addition(int x,int y)
	{
		int result=(x+y);
		System.out.println("addition Result "+result);
	}
	void multiplication(int x,int y)
	{
		int res=(x*y);
		System.out.println("multiplication result "+res);
	}
	public static Test getinstance()
	{
		if(obj==null)
		{
			obj=new Test();
		}
		return obj;
	}
}
public class Singtonmethod {

	public static void main(String[] args) {
		
		Test t1=Test.getinstance();
		t1.addition(22, 25);
		t1.multiplication(25, 25);
		
		Test t2=Test.getinstance();
		t2.addition(10, 15);
		t2.multiplication(22, 25);
		

		Test t3=Test.getinstance();
		t3.addition(20, 30);
		t3.multiplication(20, 5);
	}
	
}
