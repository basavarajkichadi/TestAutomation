package com.sgtesting.arraydemo;
class MonthlySalary
{
	int monthlyslary(int sal)
	{		
		return sal;
	}
	 MonthlySalary(int monthlyslary)
	{
		int AnnualSal=12*monthlyslary;
		System.out.println("The annula salaray of employee is "+AnnualSal);
	}
	
}

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MonthlySalary salary=new MonthlySalary(100);
		//int d=salary.monthlyslary(25000);
	}
}
