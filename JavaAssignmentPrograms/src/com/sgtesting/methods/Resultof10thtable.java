package com.sgtesting.methods;
class Table
{
	void display(int n)
	{
		for(int i=1;i<=n;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}

public class Resultof10thtable {

	public static void main(String[] args) {
		Table obj=new Table();
		obj.display(10);

	}

}
