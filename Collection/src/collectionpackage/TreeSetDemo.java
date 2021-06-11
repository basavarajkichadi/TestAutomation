package collectionpackage;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addElements();
		//removeElements();
		readElements();
	}
	static void addElements()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		obj1.add(60);
		obj1.add(70);
		obj1.add(80);
		obj1.add(90);
		obj.addAll(obj1);
		System.out.println(obj);
		
	}
	static void removeElements()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		obj1.add(60);
		obj1.add(70);
		obj1.add(80);
		obj1.add(90);
		obj.addAll(obj1);
		System.out.println(obj);
		obj.remove(10);
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
	}
	static void readElements()
	{
		TreeSet<Integer> obj=new TreeSet<Integer>();
		obj.add(10);
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		TreeSet<Integer> obj1=new TreeSet<Integer>();
		obj1.add(60);
		obj1.add(70);
		obj1.add(80);
		obj1.add(90);
		obj.addAll(obj1);
		System.out.println(obj);
		Iterator<Integer> ite=obj.iterator();
		while(ite.hasNext())
		{
			System.out.println(ite.next());
		}
		System.out.println("******************************");
		for(int zz:obj)
		{
			System.out.println(zz);
		}
		System.out.println("**************************");
		Object[] a=obj.toArray();
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
