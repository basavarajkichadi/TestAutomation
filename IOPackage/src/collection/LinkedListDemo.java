package collection;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//queDemo();
		linkedlistmethoda();
	}
	
	static void queDemo()
	{
		Queue<String> list=null;
		try
		{
			list=new LinkedList();
			list.add("Basu");
			list.add("apple");
			list.add("king");
			System.out.println(list);
			list.remove();
			System.out.println(list);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void linkedlistmethoda()
	{
		LinkedList<String> list=null;
		try
		{
			list=new LinkedList();
			list.add("Basu");
			list.add("apple");
			list.add("king");
			list.addFirst("kolavi");
			list.addLast("kiladi");
			System.out.println(list);
			list.removeFirst();
			System.out.println(list);
		
			System.out.println(list.getFirst());
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
