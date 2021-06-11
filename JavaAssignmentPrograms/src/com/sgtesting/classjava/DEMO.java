package com.sgtesting.classjava;

public class DEMO {

	public static void main(String[] args) {
		double d[][]= {{10.2,10.3,10.4},{10.5,10.6,10.7}};
int b=0;
		for( int i=0;i<d.length;i++)
		{
			for(int k=0;k<d[i].length;k++)
			{
				System.out.print(d[i][k]+" ");
			}
			System.out.println();
		}
		System.out.println("the no of rows are "+d.length);
		System.out.println(" the no of column are "+d[b].length);

	}

}
