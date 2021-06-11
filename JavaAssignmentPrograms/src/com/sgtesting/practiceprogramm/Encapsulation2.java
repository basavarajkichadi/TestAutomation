package com.sgtesting.practiceprogramm;
class Bank
{
	String bankname;
	private int accno;
	public int Accno(int accno)
	{
		this.accno=accno;
		return accno;
	}
}
public class Encapsulation2 {
	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.bankname="kbl";
		System.out.println(obj.bankname);

		int a=obj.Accno(152222);
		System.out.println("account number is "+a);
	}
}
