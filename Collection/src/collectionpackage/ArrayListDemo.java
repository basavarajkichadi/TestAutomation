package collectionpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addElements();
		//removeElements();
		//readElements();
		//readElements2();
		//readElements3();
		rawApproch();		
	}

	static void addElements()
	{
		ArrayList <String> obj=new ArrayList<String>();
		System.out.println("Elements from object "+obj);
		obj.add("Orange");
		obj.add("mango");
		obj.add("jackFruit");
		obj.add(0, "Basu");
		obj.add(0,"Akil");
		ArrayList <String> obj1=new ArrayList<String>();
		obj1.add("green");
		obj1.add("Red");
		obj1.add("Yellow");
		obj.addAll(obj1);
		System.out.println(obj);

	}


	static void removeElements()
	{
		ArrayList <String> obj=new ArrayList<String>();
		System.out.println("Elements from object "+obj);
		obj.add("Orange");
		obj.add("mango");
		obj.add("jackFruit");
		obj.add(0, "Basu");
		obj.remove(1);
		System.out.println(obj);
		obj.remove("orange");

		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	static void readElements()
	{
		ArrayList <String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Jack Fruit");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
	}
	static void readElements2()
	{
		ArrayList <String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Jack Fruit");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
	}
	static void readElements3()
	{
		ArrayList <String> obj=new ArrayList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Jack Fruit");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		for(String zz:obj)
		{
			System.out.println(zz);
		}
	}
	static void rawApproch()
	{
		ArrayList obj=new ArrayList();
		obj.add("Basu");
		obj.add(25);
		obj.add(25.2);
		obj.add('C');
		System.out.println(obj);

	}

}
