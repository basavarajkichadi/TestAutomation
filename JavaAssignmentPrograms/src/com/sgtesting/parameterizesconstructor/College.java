package com.sgtesting.parameterizesconstructor;


class Boys
{
	String Name;
	String City;
	String State;
	int Pincode;
	int Id;
	long phoneno;
	 Boys(String name,String City,String state,int pcode,int i,long pn)
	{
		this.Name=name;
		this.City=City;
		this.State=state;
		this.Pincode=pcode;
		this.Id=i;
		this.phoneno=pn;
		System.out.println("Name "+Name);
		System.out.println("city:"+City);
		System.out.println("State:"+State);
		System.out.println("Pincode"+Pincode);
		System.out.println("Id "+Id);
		System.out.println("phoneno "+phoneno);
	}	
}

class Library
{
	String Name;
	int NumberofWorkers;
	int NumberofStudents;
	int NumberofBooks;
	String DeptName;

	Library(String Name,int work,int stu,int book,String dname)
	{
		this.Name=Name;
		this.NumberofWorkers=work;
		this.NumberofStudents=stu;
		this.NumberofBooks=book;
		this.DeptName=dname;
		
		System.out.println("Name "+Name);
		System.out.println("NumberofWorkers"+NumberofWorkers);
		System.out.println("NumberofStudents"+NumberofStudents);
		System.out.println("DeptName "+ DeptName);
		System.out.println("************");
		
	}
}

public class College {

	public static void main(String[] args) {
		 Boys Rahul=new  Boys("basu","kolavi","karnataka",591344,2,984559826);
		
		 Boys sachin=new  Boys("msd","kolavi","karnataka",591344,2,984559826);
		
		Library name=new Library("ganga",2,500,2550,"mechanical");
		
		Library old=new Library("ganga",2,500,2550,"computer");
	}

}
