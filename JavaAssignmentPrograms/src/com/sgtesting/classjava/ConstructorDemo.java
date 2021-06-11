package com.sgtesting.classjava;

class kolavi
{
	String name;
	int people;
	
	kolavi(String na, int p)
	{
		this.name=na;
		this.people=p;
		
		System.out.println("name "+na);
		System.out.println("people: "+p);
		System.out.println("+++++++++++++++++++  ");
	}
}
public class ConstructorDemo {

	public static void main(String[] args) {
		
	kolavi klv=new kolavi("basu",99);
	
	kolavi bgm=new kolavi("pavan",98);
	
	}

}
