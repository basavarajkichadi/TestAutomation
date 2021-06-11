package com.sgtesting.constructoroverloading;
class Department
{
	 Department(String name)
	 {
		 System.out.println("Department name is: "+name);
	 }
	 Department(int num)
	 {
		 System.out.println("Nunber of workers in  Department is: "+num);
	 }
	 Department(String h,int num2)
	 {
		 System.out.println("Department head name is :"+h+"\nTotal number of Department is :"+num2);
	 }
}

public class Constructoroverlodding4 {

	public static void main(String[] args) {
	
		 Department dept=new  Department("mechanical");
		 Department dept2=new  Department("prabhakar",5);
		 Department dept3=new  Department(50);

	}

}
