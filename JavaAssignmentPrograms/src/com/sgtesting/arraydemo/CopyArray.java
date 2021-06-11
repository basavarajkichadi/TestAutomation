package com.sgtesting.arraydemo;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int b[]=a.clone();
		for(int z:b)
		{
			System.out.print(z+" ");
		}
		System.out.println();
		int c[]=a;
		for(int z:c)
		{
			System.out.print(z+" ");
		}
		System.out.println();
		int d[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			d[i]=a[i];
		}
		for(int z:d)
		{
			System.out.print(z+" ");
		}
		System.out.println();
		int e[]=Arrays.copyOf(a, a.length);
		for(int z:e)
		{
			System.out.print(z+" ");
		}

	}

}
