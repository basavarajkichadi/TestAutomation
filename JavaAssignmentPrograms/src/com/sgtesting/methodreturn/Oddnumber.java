package com.sgtesting.methodreturn;

class Oddnumber1
{
	int[] Oddnumber2()
	{
		int size=0;
		for(int i=91;i>=71;i--)
		{
			if(i%2==1)
			{
				size++;
			}
		}
		System.out.println("size of the element is " +size);

		int a[]=new int[size];
		int k=0;
		for(int i=91;i>=71;i--)
		{
			if(i%2==1)
			{
				a[k]=i;
				k++;
			}
		}
		return a;
	}
}

public class Oddnumber {

	public static void main(String[] args) {
		Oddnumber1 obj= new Oddnumber1();
		int c[]=obj.Oddnumber2();
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}


	}

}
