package com.sgtesting.classjava;
class Outer
{
	String fname="Basu";
	Inner inner=new Inner();

	void showage()
	{
		System.out.println("Age: " +inner.age);
	}
	class Inner
	{
		int age=17;
		void showfn()
		{
			System.out.println("Firstname "+fname);
		}
	}
}

public class Innreandouterclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer obj=new Outer();
		obj.showage();
		obj.inner.showfn();

		

	}

}
