package collection;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//createandWrite();
		readfile();
	}
	static void createandWrite()
	{
		FileOutputStream fout=null;
		Properties prop=null;
		try
		{
			fout=new FileOutputStream("E:\\file\\simple.properties");
			prop=new Properties();
			prop.setProperty("Name", "Basavaraj");
			prop.setProperty("user", "admin");
			prop.setProperty("pwd", "manager");
			prop.store(fout, null);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{

				fout.flush();fout.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	static void readfile()
	{
		FileInputStream fin=null;
		Properties prop=null;
		try
		{
			fin=new FileInputStream ("E:\\file\\Simple.properties");
			prop=new Properties();
			prop.load(fin);
			System.out.println(prop.get("Name"));
			System.out.println(prop.get("user"));
			System.out.println(prop.get("pwd"));
			System.out.println("***************");
			Set<Object> set=prop.keySet();
			Iterator<Object> it=set.iterator();
			while(it.hasNext())
			{
				System.out.println(it.next());
				
			}
			System.out.println("***************");
			prop.forEach((k,v)->System.out.println(k+"="+v));
			System.out.println("***************");
			Set<Entry<Object,Object>> set1=prop.entrySet();
			Iterator<Entry<Object,Object>> it1=set1.iterator();
			while(it1.hasNext())
			{
				Entry<Object, Object> mp=it1.next();
				System.out.println(mp.getKey()+"="+mp.getValue());
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{

				
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
