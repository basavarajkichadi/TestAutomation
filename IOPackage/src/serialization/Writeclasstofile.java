package serialization;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Myclass implements Serializable
{
	int age;
	String name;
	
}
public class Writeclasstofile {

	public static void main(String[] args) {
		FileOutputStream fout=null;
		ObjectOutputStream obj=null;
		Myclass cls=null;
		try
		{
			fout=new FileOutputStream("E:\\file\\series.ser");
			obj=new ObjectOutputStream(fout);
			cls=new Myclass();
			cls.age=25;
			cls.name="Basu";
			obj.writeObject(cls);
		}catch(Exception e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				
			}catch(Exception e) {
				e.printStackTrace();
			}
		}

	}

}
