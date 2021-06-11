package com.sgtesting.iopackage;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerialistionDemo {
	public static void main(String[] args)
	{
		serializationDemo();
	}
	static void serializationDemo()
	{
		FileOutputStream fout=null;
		ObjectOutputStream oostr=null;
		Cars obj=new Cars();
		try
		{
			fout=new FileOutputStream("E:\\Example\\Village\\Cars.ser");
			oostr=new ObjectOutputStream(fout);
			oostr.writeObject(obj);
			System.out.println("written an object in to a File Successfully");
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				oostr.close();
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}

