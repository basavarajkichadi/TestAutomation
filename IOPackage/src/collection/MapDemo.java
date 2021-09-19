package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addElements();
	}
	
	static void addElements()
	{
		Map<String,String> omap=null;
		try
		{
			omap=new HashMap();
			omap.put("A", "Apple");
			omap.put("B", "Banana");
			omap.put("A", "Apple");
			omap.put("C", "Cat");
			omap.put("A", "Apple");
			omap.put(null, null);
			System.out.println(omap);
			System.out.println(omap.size());
			
			Set<String> keys=omap.keySet();
			for(String AA:keys)
			{
				System.out.println(AA);
			}
			System.out.println();
			
			System.out.println("Reading Keys");
			Iterator<String> it=keys.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
			}
			System.out.println("Reading only values");
			Collection<String> col=omap.values();
			Iterator<String> it1=col.iterator();
			while(it1.hasNext())
			{
				System.out.println(it1.next());
			}
			
			System.out.println("Reading key values");
			omap.forEach((key,val)->System.out.println(key+"=="+val));
			
			Set<Entry<String,String>> set=omap.entrySet();
			Iterator<Entry<String,String>> it3=set.iterator();
			while(it3.hasNext())
			{
			Map.Entry<String, String> mp=it3.next();
			System.out.println(mp.getKey()+"=="+mp.getValue());
			}
			if(omap.containsKey("A")) {System.out.println("Key is presrent");}
			else {System.out.println("key is not Present");}
			
			if(omap.containsValue("apple")) {System.out.println("Values is present");}
			else {System.out.println("Value is not present");}
			
			System.out.println(omap.get("B"));
			String val=omap.remove("B");
			System.out.println(val);
			System.out.println(omap);
			boolean res=omap.remove("C", "Cat");
			System.out.println(omap);
			
		
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
