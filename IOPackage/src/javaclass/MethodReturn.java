package javaclass;
class Return
{
	public int addition()
	{
		int a=50;
		int b=60;
		int c=a+b;System.out.println(c);
		return c;
	}

}

public class MethodReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Return ret=new Return();
		int add=ret.addition();

	}

}
