package com.sgtesting.methods;
class Number
{
	void first(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("sum of first ten numbers is "+sum);
	}
}
public class Sumoffirst10 {

	public static void main(String[] args) {
		
		Number obj=new Number();
		obj.first(10);
	}

}
