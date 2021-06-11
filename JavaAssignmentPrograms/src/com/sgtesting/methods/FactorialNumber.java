package com.sgtesting.methods;
class Factor
{
	void factor1(int n)
	{
		int sum=1;
		for(int i=1;i<=n;i++)
		{
			sum=sum*i;	
		}
		System.out.println(sum);
			
	}
}

public class FactorialNumber {

	public static void main(String[] args) {
		Factor obj=new Factor();
		obj.factor1(6);

	}

}
