package arrays;

import java.util.Arrays;

class Addition
{
	public int[] addition(int a[],int b[])
	{
		int c[]=new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i]+b[i];
		}
		return c;
	}
}

public class AdditionOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub add
		Addition add=new Addition();
		int a[]= {1,2,3,4};
		int b[]= {1,2,3,4};
	int[] c=add.addition(a, b);
		System.out.println(Arrays.toString(c));

	}

}
