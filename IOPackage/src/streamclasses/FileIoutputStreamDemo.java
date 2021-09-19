package streamclasses;

import java.io.FileOutputStream;
import java.util.Arrays;

public class FileIoutputStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writefile();
	}
	static void writefile()
	{
		FileOutputStream fout=null;
		try
		{
			fout=new FileOutputStream("E:\\file\\test.txt",true);
		String content="Welcome to banglore";
		content+="belagavi";
		byte a[]=content.getBytes();
		fout.write(a);
		System.out.println(Arrays.toString(a));
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.flush();fout.close();fout=null;
			}catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

}
