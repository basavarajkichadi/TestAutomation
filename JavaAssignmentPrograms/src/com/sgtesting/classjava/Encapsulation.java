package com.sgtesting.classjava;
class Bank
{
	String bankname;
	private int accountno;
	
	public int setAccountNo(int accountno)
	{
		this.accountno=accountno;
		return accountno;
	}
	
}

public class Encapsulation {

	public static void main(String[] args) {
	
		Bank obj=new Bank();
		obj.bankname="SBi";
		System.out.println("Bank name is "+obj.bankname);
		
		int a=obj.setAccountNo(1265898);
		System.out.println("Account number is "+a);
		

	}

}
