package collectionpackage;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addElements();
		//removeElements();
		readElements();
	}
	static void addElements()
	{
		HashSet<String>obj=new HashSet<String>();
		obj.add("tiger");
		obj.add("tiger");
		obj.add("tiger");
		obj.add("Lion");
		obj.add("Snake");
		System.out.println(obj);
		HashSet<String>obj1=new HashSet<String>();
		obj1.add("Don");
		obj1.add("King");
		obj.add("Long");
		obj.addAll(obj1);
		System.out.println(obj);

	}
	static void removeElements()
	{
		HashSet<String>obj=new HashSet<String>();
		obj.add("tiger");
		obj.add("tiger");
		obj.add("tiger");
		obj.add("Lion");
		obj.add("Snake");
		System.out.println(obj);
		HashSet<String>obj1=new HashSet<String>();
		obj1.add("Don");
		obj1.add("King");
		obj.add("Long");
		obj.addAll(obj1);
		System.out.println(obj);
		obj.remove("tiger");
		System.out.println(obj);
		obj.removeAll(obj);
	}
	static void readElements()
	{
		HashSet<String>obj=new HashSet<String>();
		obj.add("tiger");
		obj.add("tiger");
		obj.add("tiger");
		obj.add("Lion");
		obj.add("Snake");
		System.out.println(obj);
		HashSet<String>obj1=new HashSet<String>();
		obj1.add("Don");
		obj1.add("King");
		obj.add("Long");
		obj.addAll(obj1);
		System.out.println(obj);
		Iterator<String> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		System.out.println("********************");
		for(String zz:obj)
		{
			System.out.println(zz);
		}
		System.out.println("*************************");
		Object[] a=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
	static void rawApproach()
	{
		HashSet obj=new HashSet();
		{
			obj.add("King");
			obj.add(25);
			System.out.println(obj);
		}
	}

 

}
