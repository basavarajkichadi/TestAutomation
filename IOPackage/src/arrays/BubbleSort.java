package arrays;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[]= {8,5,6,4,1,2,3,7};
		for(int i=0;i<res.length;i++)
		{
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]>res[j])
				{
					int temp=res[i];
					res[i]=res[j];
					res[j]=temp;
				}	
			}
			System.out.print(res[i]+" ");
		}
		System.out.println();
		System.out.println(Arrays.toString(res));

	}

}
