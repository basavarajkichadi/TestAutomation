package com.sgtesting.classjava;
class Sample
{
	 public static Sample obj=null;
	private Sample()
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
	public static Sample getinstance(Sample Obj)
	{
		if(obj==null)
		{
			obj=new Sample();
		}
		return obj;
	}
}

public class Sigleton2 {

	public static void main(String[] args) {
		Sample t1=Sample.getinstance(null);
		t1.addition(22, 25);
		t1.multiplication(25, 25);
		
		Sample t2=Sample.getinstance(null);
		t2.addition(10, 15);
		t2.multiplication(22, 25);
		

		Sample t3=Sample.getinstance(null);
		t3.addition(20, 30);
		t3.multiplication(20, 5);


		// TODO Auto-generated method stub

	}

}
