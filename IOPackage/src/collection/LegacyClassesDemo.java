package collection;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Stack;

public class LegacyClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	firstinlastout();
		dictionaeydemo();
	}
	static void firstinlastout()
	{ 
		Stack<Integer> st=null;
		try
		{
			st=new Stack<Integer>();
			st.push(100);
			st.push(200);
			st.push(300);
			st.push(400);
			st.push(500);
			st.push(600);
			System.out.println(st);
			st.pop();
			System.out.println(st);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}
	
	static void dictionaeydemo()
	{
		Dictionary<String,String> dic=null;
		
		try
		{
			dic=new Hashtable<String,String>();
			dic.put("A", "APPLE");
			dic.put("B", "BAT");
			dic.put("C", "CAT");
			System.out.println(dic);
			Enumeration<String> en=dic.elements();
			while(en.hasMoreElements())
			{
				System.out.println(en.nextElement());
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
