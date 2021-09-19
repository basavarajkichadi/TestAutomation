package javaclass;
class Overload
{
	Overload()
	{
		System.out.println("no parameters");
	}
	Overload(String name,int age)
	{
		System.out.println("Two Parameters "+"name "+name+" age  "+age);
	}
	Overload(int age,String name)
	{
		System.out.println("Squence of datatype is Change "+"age:"+age+" name: "+name);
	}
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload over1=new Overload();
		Overload over2=new Overload("basu",25);
		Overload over3=new Overload(25,"basu");

	}

}
