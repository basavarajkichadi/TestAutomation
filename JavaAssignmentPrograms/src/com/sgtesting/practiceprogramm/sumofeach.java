package com.sgtesting.practiceprogramm;

public class sumofeach {

	public static void main(String[] args) {
		int num=1234;
		int sum=0;
		for(int i=num;i>0;i=i/10)
		{
			int remainder=i%10;
			sum=sum+remainder;
		}
		System.out.println(sum);

	}

}
