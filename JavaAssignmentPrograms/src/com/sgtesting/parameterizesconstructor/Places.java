package com.sgtesting.parameterizesconstructor;
class village
{
	String name;
	String district;
	
	village(String name, String dis)
	{
		
		this.name=name;
		district=dis;
		System.out.println("Name "+name);
		System.out.println("district "+district);
		System.out.println("++++++++++++++++++");
	}
}

class state
{
	String name;
	int noofdistricts;
	
	state(String name,int dno)
	{
		this.name=name;
		noofdistricts=30;
		System.out.println("name: "+name);
		System.out.println("noofdistricts"+noofdistricts);
		System.out.println("*********************");
	}
	
}
class country
{
	String name;
	int noofstates;
	
	country(String name,int state)
	{
		this.name=name;
		noofstates=state;
		System.out.println("name"+name);
		System.out.println("noofstates "+noofstates);
	}
}

public class Places {

	public static void main(String[] args) {
		
		village vil=new village("kolavi","belgaum");
		village name=new village("tavag","belgaum");
		
		state obj=new state("karnataka",30);
		
		country cou=new country("india",29);
		

	}

}