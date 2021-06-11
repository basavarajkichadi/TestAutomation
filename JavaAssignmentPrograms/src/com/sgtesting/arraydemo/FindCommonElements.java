package com.sgtesting.arraydemo;

public class FindCommonElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,5,4,6};
		int b[]= {4,6,2,3};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.println(a[i]);
				}	
			}
		}
	}
}
