package collectionpackage;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addElements();
		//removeElements();
		//readElements();
		rawApproach();
	}
	static void addElements()
	{
		Vector<String> obj=new Vector<String>();
		obj.add("mango");
		obj.add("Banana");
		obj.add(1, "Apple");
		System.out.println(obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("Red");
		obj1.add("Yellow");
		obj1.add("Chocolate");
		obj.addAll(obj1);
		System.out.println(obj);
	}
	static void removeElements()
	{
		Vector<String> obj=new Vector<String>();
		obj.add("mango");
		obj.add("Banana");
		obj.add(1, "Apple");
		System.out.println(obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("Red");
		obj1.add("Yellow");
		obj1.add("Chocolate");
		obj.addAll(obj1);
		System.out.println(obj);
		obj.remove(1);
		obj.remove("mango");
		System.out.println(obj);
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	static void readElements()
	{
		Vector<String> obj=new   Vector<String>();
		obj.add("mango");
		obj.add("Banana");
		obj.add(1, "Apple");
		System.out.println(obj);
		Vector<String> obj1=new Vector<String>();
		obj1.add("Red");
		obj1.add("Yellow");
		obj1.add("Chocolate");
		obj.addAll(obj1);
		System.out.println(obj);
		ListIterator<String> ite=obj.listIterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		System.out.println("*******************************");
		for(int i=0;i<obj.size();i++)
		{
			System.out.println(obj.get(i));
		}
		System.out.println("*************************");
		for(String zz:obj)
		{
			System.out.println(zz);
		}
		Enumeration<String> elements=obj.elements();
		while(elements.hasMoreElements())
		{
			System.out.println(elements.nextElement());
		}
	}
	static void rawApproach()
	{
		Vector obj=new Vector();
		obj.add("Name");
		obj.add(25);
		obj.add('Z');
		obj.add(25.5);
		System.out.println(obj);
	}
	

}
