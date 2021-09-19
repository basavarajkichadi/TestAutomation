package javaclass;

class Execute
{
	static
	{
		System.out.println("This is a Static block");
	}
	Execute()
	{
		System.out.println("This is a Default constructor");
	}
	public static int salary()
	{
		return 2000;
	}
	
}

public class ExcecuteStaticBlockAlone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			Class.forName("javaclass.Execute");
		}catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
