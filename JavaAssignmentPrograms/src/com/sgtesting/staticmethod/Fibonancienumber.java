package com.sgtesting.staticmethod;
class Fibonancie
{
		static int[] fabonacciSe2()
		{
			int size=0;
			for(int i=1;i<=8;i++)
			{
				size=size+1;
			}
			int h[]=new int[size];
			int k=0;
			int a=0;
			int b=1;
			System.out.println(a);
			System.out.println(b);
			for(int j=0;j<8;j++)
			{
				int c=a+b;
				h[k]=c;
				k++;
				a=b;
				b=c;
			}
			return h;
	}
}

public class Fibonancienumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int b[]=Fibonancie.fabonacciSe2();
		 for(int zz:b)
		 {
			 System.out.println(zz);
		 }
		 
				 

	}

}
