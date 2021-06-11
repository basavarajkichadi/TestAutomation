package com.sgtesting.noargsconstructor;

class village
{
	String name;
	String statename;
	String districtname;
	int pincode;
	int  area ;
	int population;

	village()
	{
		name="mudddebihal";
		statename="Karanatak";
		population=3587;
		area=876;
		districtname="bijapur";
		pincode=586212;
		System.out.println(" village name: "+name);
		System.out.println("Statename: "+statename);
		System.out.println("Population of village: "+population);
		System.out.println("Area of village: "+area);
		System.out.println("Districtname: "+districtname);
		System.out.println("pincode: "+pincode);
		System.out.println("********************");
	}
}
class state
{
	String statename;
	int population;
	int area;
	int districtsnum;
	int schoolsnumber;

	state()
	{
		statename="karnatak";
		population=50000000;
		area=1000000;
		districtsnum=30;
		schoolsnumber=987546;
		System.out.println("Statename: "+statename);
		System.out.println("Population of state: "+population);
		System.out.println("Area of state: "+area);
		System.out.println("Districtnumbers: "+districtsnum);
		System.out.println("schools number in the state: "+schoolsnumber);
		System.out.println("********************");
	}
}
class country
{
	String countryname;
	int population;
	int area;
	int statenum;
	int schoolsnumber;

	country()
	{
		countryname="India";
		population=500000000;
		area=989000000;
		statenum=30;
		schoolsnumber=968787546;
		System.out.println("countryname: "+countryname);
		System.out.println("Population of country: "+population);
		System.out.println("Area of country: "+area);
		System.out.println("statenumbers: "+statenum);
		System.out.println("schools number in the country: "+schoolsnumber);
		System.out.println("********************");
	}
}
public class Places {

	public static void main(String[] args)
	{
		village obj= new village();


		state ob=new state();


		country oz= new country();

	}

}





