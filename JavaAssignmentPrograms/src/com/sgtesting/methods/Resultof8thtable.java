package com.sgtesting.methods;
class Reverse
{
	void basu(int n)
	{
		for(int i=10;i>0;i--)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
public class Resultof8thtable {

	public static void main(String[] args) {
		
		Reverse obj=new Reverse();
		obj.basu(8);
	}

}
