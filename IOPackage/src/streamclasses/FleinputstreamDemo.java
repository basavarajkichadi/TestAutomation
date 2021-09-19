package streamclasses;

import java.io.FileInputStream;

public class FleinputstreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		readfiles();
	}
	static void readfiles()
	{
		FileInputStream fin=null;
		try
		{
			fin=new FileInputStream("E:\\File\\Example.txt");
			int out=0;
			while(true)
			{
				out=fin.read();
				if(out==-1)
				{
					break;
				}
				char ch=(char)out;
				System.out.print(ch);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fin.close();
				fin=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
