package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.Spliterator;

public class HashsetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hashsetDemo();
	}
	
	static void hashsetDemo()
	{
		Set<String> set=new HashSet();
		set.add("pizza");
		set.add("banana");
		set.add("king");
		set.add("fruit");
		set.add("basu");
		set.add("apple");
		set.add("apple");
		System.out.println(set);
		
			Spliterator<String> sp=set.spliterator();
		sp.forEachRemaining((a)->System.out.println(a));
		System.out.println("**for each***");
		for(String s:set)
		{
			System.out.println(s);
		}
		System.out.println();
		set.forEach((val)-> System.out.println(val));
	}

}
