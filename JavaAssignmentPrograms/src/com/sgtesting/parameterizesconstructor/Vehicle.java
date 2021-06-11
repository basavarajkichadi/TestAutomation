package com.sgtesting.parameterizesconstructor;



class Twowheelers
{
	String companyname;
	String colour;
	int maxspeed;
	int average;
	int Enginecc;
	int price;
	
	Twowheelers(String co,String col,int ms, int avg,int cc,int rate)
	{
		this.companyname=co;
		this.colour=col;
		this.maxspeed=ms;
		this.average=avg;
		this.Enginecc=cc;
		this.price=rate;
		System.out.println("companyname:"+companyname);
		System.out.println("colour "+colour);
		System.out.println("maxspeed"+maxspeed);
		System.out.println("average"+average);
		System.out.println("Enginecc"+Enginecc);
		System.out.println(" price "+ price);
		System.out.println("******************");
	}
}
class Fourwheelers
{
	String companyname;
	String colour;
	int maxspeed;
	int average;
	int Enginecc;
	int price;
	
	Fourwheelers(String co,String col,int ms, int avg,int cc,int rate)
	{	
		companyname=co;
		colour=col;
		maxspeed=ms;
		average=avg;
		Enginecc=cc;
		price=rate;
		System.out.println("companyname:"+companyname);
		System.out.println("colour "+colour);
		System.out.println("maxspeed"+maxspeed);
		System.out.println("average"+average);
		System.out.println("Enginecc"+Enginecc);
		System.out.println(" price "+ price);
		System.out.println("****************");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		Twowheelers bike=new Twowheelers("hero","white",160,60,150,15000);
		
		Twowheelers basu=new Twowheelers("bajaj","white",60,40,50,150000);
		
		Fourwheelers car=new Fourwheelers("honda","black",150,50,200,15000);
		
		Fourwheelers msd=new Fourwheelers("jagwar","black",150,50,200,150000);
	}

}
