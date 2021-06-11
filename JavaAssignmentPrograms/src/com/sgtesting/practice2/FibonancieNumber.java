package com.sgtesting.practice2;
class Number
{
	int[] Shownumber(int n)
	{
		int size=0;
		for(int i=1;i<=n;i++)
		{
			size++;
		}
		int a[]=new int[size];
		int k=0;
		int fn=0;
		int sn=1;
		System.out.println(fn);
		System.out.println(sn);
		for(int i=1;i<=n;i++)
		{
			 int tn=fn+sn;
			 a[k]=tn;
			 k++;
			 fn=sn;
			 sn=tn;
		}
		return a;
	}
}
public class FibonancieNumber {
	public static void main(String[] args) {
		Number obj=new Number();
		int d[]=obj.Shownumber(8);
		for(int zz:d)
		{
			System.out.println(zz);
		}
	}

}
