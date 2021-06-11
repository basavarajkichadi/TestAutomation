package collectionpackage;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addElements();
		//removeElements();
		//readElements();
		//readElements2();
		//readElements3();
		rawApproch();
		//queueDemo();

	}

	static void addElements()
	{
		LinkedList <String> obj=new LinkedList<String>();
		System.out.println("Elements from object "+obj);
		obj.add("Orange");
		obj.add("mango");
		obj.add("jackFruit");
		obj.add(0, "Basu");
		obj.add(0,"Akil");
		LinkedList <String> obj1=new LinkedList<String>();
		obj1.add("green");
		obj1.add("Red");
		obj1.add("Yellow");
		obj.addAll(obj1);
		System.out.println(obj);

	}


	static void removeElements()
	{
		LinkedList <String> obj=new LinkedList<String>();
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
		LinkedList <String> obj=new LinkedList<String>();
		System.out.println("Elements :"+obj);
		obj.add("Orange");
		obj.add("Apple");
		obj.add("Mango");
		obj.add("Jack Fruit");
		obj.add("Mango");
		System.out.println("Elements :"+obj);
		ListIterator<String> list=obj.listIterator();
		while(list.hasNext())
		{
			System.out.println(list.next());
			
		}
		System.out.println("***************************");
		while(list.hasPrevious())
		{
			System.out.println(list.previous());
		}
	}
	static void readElements2()
	{
		List <String> obj=new LinkedList<String>();
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
		LinkedList <String> obj=new LinkedList<String>();
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
		LinkedList obj=new LinkedList();
		obj.add("Basu");
		obj.add(25);
		obj.add(25.2);
		obj.add('C');
		System.out.println(obj);

	}
	static void queueDemo()
	{
		LinkedList <Integer> obj=new LinkedList<Integer>();
		obj.add(500);
		obj.add(200);
		obj.add(300);
		obj.add(400);
		obj.add(400);
		obj.add(600);
		obj.remove();
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
		obj.remove();
		System.out.println(obj);
	}
	
}

