package arrays;

import java.util.Arrays;

public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {3,1,5,7};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int max=arr[arr.length-1];
		for(int i=0;i<max ;i++)
		{
			int index=0;
			if(i==arr[index])
			{
				index++;
			}
			else
			{
				System.out.print(i+" ");
			}

		}



	}

}


