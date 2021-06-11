package com.sgtesting.methodreturn;
class Boolean1
{
	boolean evenumber1(int n)
	{
		int flag=0;
		for(int i=20;i<=40;i++)
		{
			if(i%2==0)
			{
				flag++;
			}

		}
		if(flag==0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	void display()
	{
		for(int k=20;k<=40;k++)
		{
			if(evenumber1(k)==true)
			{
				System.out.println(k);
			}
		}
	}
}


public class Evennumbersboolean {

	public static void main(String[] args) {
		
		Boolean1 obj=new Boolean1();
		//obj.display();
		
		for(int k=20;k<=40;k++)
		{
			if(obj.evenumber1(k)==true)
			{
				System.out.println(k);
			}
		}
	}

}
