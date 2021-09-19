package javaclass;
class outer
{
	int age=25;
	static String name="basu";
	
	public static void addition()
	{
		System.out.println("OuterMethod");
	}
	public void division()
	{
		inner in=new inner();
		in.multi();
	}
	 class inner
	{
		int date=25;
		inner()
		{
			System.out.println("Name is: "+name);
			System.out.println(age);
		}
		public void multi()
		{	
			System.out.println("Inner class method");
		}
	}
}

public class InnerAndOuterClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out=new outer();
		outer.addition();
		out.division();
		
	}

}
