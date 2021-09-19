package arrays;

public class DupicateNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int res[]= {8,5,6,4,1,2,3,112,2,2,3};
		for(int i=0;i<res.length;i++)
		{
			for(int j=i+1;j<res.length;j++)
			{
				if(res[i]==res[j])
				{
					System.out.println("Duplicate "+res[i]);
				}
			}
		}
		

	}

}
