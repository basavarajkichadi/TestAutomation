package com.sgtesting.arraydemo;

import java.util.Arrays;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {0, 1, 3, 4, 5, 6};
		int arr1[]= {0,3,4,5,6};
		if(Arrays.equals(arr, arr1))
		{
			System.out.println("Same array");
		}
		else
		{
			System.out.println("Different array");
		}

	}
}
