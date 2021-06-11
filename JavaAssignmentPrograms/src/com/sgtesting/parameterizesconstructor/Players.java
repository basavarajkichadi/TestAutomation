package com.sgtesting.parameterizesconstructor;
class cricket
{
	String name;
	int noofplayers;
	cricket(String name,int count)
	{
		this.name=name;
		noofplayers=count;
		System.out.println("name "+name);
		System.out.println("noofplayers"+count);
		System.out.println("                  ");

	}
}
class hockey
{
	String name;
	int noofplayers;
	hockey(String name,int count)
	{
		this.name=name;
		noofplayers=count;
		System.out.println("name "+name);
		System.out.println("noofplayers"+count);
		System.out.println("                  ");
	}
}
class volleyball
{
	String name;
	int noofplayers;
	volleyball(String name,int count)
	{

		this.name=name;
		noofplayers=count;
		System.out.println("name "+name);
		System.out.println("noofplayers: "+count);
		System.out.println("                  ");
	}
}
public class Players {

	public static void main(String[] args) {
		cricket cri=new cricket("msd",11);
		cricket sachin=new cricket("sachin",11);
		
		hockey hoc=new hockey("basu",11);
		hockey hock=new hockey("basu",11);

		volleyball vol=new volleyball("balll",6);

	}

}
