package com.sgtesting.methods;
class div
{
	void divnumber(int n)
	{
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			if(i%n==0)
			{
				sum=sum+i;
			}
		}
		System.out.println("sum of numbers between 1-100 divisible by 6 is "+sum);
	}
}
public class Divisibleby6 {

	public static void main(String[] args) {
		div obj1=new div();
		obj1.divnumber(6);

	}

}
