package com.sgtesting.methods;
class ovel
{
	void ovels(char ch)
	{
		if((ch=='A')||(ch=='E')||(ch=='I')||(ch=='O')||(ch=='U'))
		{
			System.out.println("Given character is ovel");
		}
		else
		{
			System.out.println("given character is consonent");
		}
	}
}
public class Oveldemo {

	public static void main(String[] args) {
		ovel obj=new ovel();
		
		obj.ovels('B');

	}

}
