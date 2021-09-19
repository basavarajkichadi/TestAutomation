package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

public class ArraylistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//arraylist();
		//addallcollection();
		//removedemo();
		//containDemo();
		//modifyElements();
		//sortandreverse();
		//collectionToArray();
		//addPrimitives();
		rawapproach();
	}
	static void arraylist()
	{
		ArrayList<String> list=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("Banana");
			list.add("Mango");
			list.add(0, "papaya");
			System.out.println(list);
			System.out.println();
			System.out.println("****************For loop************");
			
			for(int i=0;i<list.size();i++)
			{
				System.out.println(list.get(i));
			}
			System.out.println();
			System.out.println("****************For Each ************");
			for(String val:list)
			{
				System.out.println(val);
			}

			System.out.println();
			System.out.println("****************While loop************");

			int i=0;
			while(i<list.size())
			{
				System.out.println(list.get(i));
				i++;
			}

			System.out.println();
			System.out.println("****************Dowhile loop************");
			int j=0;
			do
			{
				System.out.println(list.get(j));
				j++;
			}while(j<list.size());

			System.out.println();
			System.out.println("****************Iterator************");
			Iterator<String> it=list.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			System.out.println();
			System.out.println("****************foreach()************");
			list.forEach((value)->System.out.println(value));

			System.out.println();
			System.out.println("****************ListIterator************");
			ListIterator<String> lit=list.listIterator();
			while(lit.hasNext())
			{
				System.out.println(lit.next());
			}System.out.println();
			System.out.println("****************ListIterator Reverse************");
			while(lit.hasPrevious())
			{
				System.out.println(lit.previous());
			}
			System.out.println();
			System.out.println("****************Spliterator************");
			Spliterator<String> sp=list.spliterator();
			sp.forEachRemaining(System.out::println);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}


		finally
		{
			list=null;
		}
	}
	static void addallcollection()
	{
		List<String> list=null;
		List<String> list1=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("lion");
			list.add("Tiger");
			list.add(0, "Banana");
			System.out.println(list);
			System.out.println("*********************");

			list1=new ArrayList<String>();
			list1.add("Pig");
			list1.add("Flower");
			list1.addAll(list);
			System.out.println(list1);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{

		}
	}

	static void removedemo()
	{
		List<String> list=null;
		List<String> list1=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("lion");
			list.add("Tiger");
			list.add(0, "Banana");
			System.out.println(list);
			System.out.println("*********************");

			list1=new ArrayList<String>();
			list1.add("Pig");
			list1.add("Flower");
			list1.addAll(list);
			System.out.println(list1);

			list.remove(0);
			list.remove("lion");
			System.out.println(list);
			boolean ele=list.removeAll(list);
			System.out.println(ele);
			list1.clear();
			if((list.isEmpty())&&list1.isEmpty())
			{
				System.out.println("Both collections are empty");
			}
			else {System.out.println("Collection are not empty");}


		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			list=null;
			list1=null;
		}
	}
	static void containDemo()
	{
		List<String> list=null;
		List<String> list1=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("lion");
			list.add("Tiger");
			list.add(0, "Banana");
			System.out.println(list);
			System.out.println("*********************");

			list1=new ArrayList<String>();
			list1.add("Pig");
			list1.add("Flower");
			list1.addAll(list);
			System.out.println(list1);

			if(list.contains("Apple")) {System.out.println("Apple Exists");}
			else {System.out.println("Apple does not exists");}


		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			list=null;
			list1=null;
		}
	}
	static void modifyElements()
	{
		List<String> list=null;
		List<String> list1=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("lion");
			list.add("Tiger");
			list.add(0, "Banana");
			System.out.println(list);
			System.out.println("*********************");

			list1=new ArrayList<String>();
			list1.add("Pig");
			list1.add("Flower");
			list1.addAll(list);
			System.out.println(list1);

			list.set(1, "Aeroplanr");
			System.out.println(list);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			list=null;
			list1=null;
		}
	}

	static void sortandreverse()
	{
		List<String> list=null;
		List<String> list1=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("lion");
			list.add("Tiger");
			list.add(0, "Banana");
			System.out.println(list);
			System.out.println("*********************");

			list1=new ArrayList<String>();
			list1.add("Pig");
			list1.add("Flower");
			list1.addAll(list);
			System.out.println(list1);

			Collections.sort(list);
			System.out.println(list);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			list=null;
			list1=null;
		}
	}

	static void collectionToArray()
	{
		List<String> list=null;
		List<String> list1=null;
		try
		{
			list=new ArrayList<String>();
			list.add("Apple");
			list.add("lion");
			list.add("Tiger");
			list.add(0, "Banana");
			System.out.println(list);
			System.out.println("*********************");

			list1=new ArrayList<String>();
			list1.add("Pig");
			list1.add("Flower");
			list1.addAll(list);
			Object obj[]=list.toArray();
			System.out.println(obj.length);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			list=null;
			list1=null;
		}
	}
	static void addPrimitives()
	{
		List<Integer> list=null;
		List<Character> list1=null;
		List<Boolean> list2=null;
		try
		{
			list=new ArrayList<Integer>();
			list1=new ArrayList<Character>();
			list2=new ArrayList<Boolean>();
			list.add(20);
			list.add(40);
			System.out.println(list);
			list1.add('A');
			list1.add('B');
			System.out.println(list1);
			list2.add(true);
			list2.add(false);
			System.out.println(list2);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			list=null;
			list1=null;
		}
	}
	static void rawapproach()
	{
		List list=null;
		try
		{
			list=new ArrayList();
			list.add(true);
			list.add("Basu");
			list.add(25);
			System.out.println(list);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}



}
