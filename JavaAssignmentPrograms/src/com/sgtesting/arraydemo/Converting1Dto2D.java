package com.sgtesting.arraydemo;

import java.util.Arrays;

public class Converting1Dto2D {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5,6};
		int res[][]=new int[2][3];
		int k=0;
		for(int i=0;i<res.length;i++)
		{
			for(int j=0;j<res[i].length;j++)
			{
				res[i][j]=a[k];
				k++;
			}
		}
		System.out.println(Arrays.deepToString(res));
	}
}


