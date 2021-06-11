package com.sgtesting.defaultconstructor;
class village
{
	String name;
	String statename;
	String districtname;
	int pincode;
	int  area ;
	int population;
}
class state
{
	String statename;
	int population;
	int area;
	int districtsnum;
	int schoolsnumber;
}
class country
{
	String countryname;
	int population;
	int area;
	int statenum;
	int schoolsnumber;
}
public class Places {

	public static void main(String[] args)
	{
		village obj= new village();
		obj.name="mudddebihal";
		obj.statename="Karanatak";
		obj.population=3587;
		obj.area=876;
		obj.districtname="bijapur";
		obj.pincode=586212;
		System.out.println(" village name: "+obj.name);
		System.out.println("Statename: "+obj.statename);
		System.out.println("Population of village: "+obj.population);
		System.out.println("Area of village: "+obj.area);
		System.out.println("Districtname: "+obj.districtname);
		System.out.println("pincode: "+obj.pincode);
		System.out.println("********************");

		state ob=new state();
		ob.statename="karnatak";
		ob.population=50000000;
		ob.area=1000000;
		ob.districtsnum=30;
		ob.schoolsnumber=987546;
		System.out.println("Statename: "+ob.statename);
		System.out.println("Population of state: "+ob.population);
		System.out.println("Area of state: "+ob.area);
		System.out.println("Districtnumbers: "+ob.districtsnum);
		System.out.println("schools number in the state: "+ob.schoolsnumber);
		System.out.println("********************");

		country oz= new country();
		oz.countryname="India";
		oz.population=500000000;
		oz.area=989000000;
		oz.statenum=30;
		oz.schoolsnumber=968787546;
		System.out.println("countryname: "+oz.countryname);
		System.out.println("Population of country: "+oz.population);
		System.out.println("Area of country: "+oz.area);
		System.out.println("statenumbers: "+oz.statenum);
		System.out.println("schools number in the country: "+oz.schoolsnumber);
		System.out.println("********************");
	}

}
