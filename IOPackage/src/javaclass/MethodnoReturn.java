package javaclass;

class NoReturn
{
	public void addition()
	{
		int a=2;
		int b=2;
		int c=a+b;
		System.out.println(c);
	}
	
	public void eligibleforVoting(int age)
	{
		if(age>18&&age<100)
		{
			System.out.println("eligible for voting");
		}
	}
}

public class MethodnoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoReturn ret=new NoReturn();
		ret.addition();
		ret.eligibleforVoting(25);

	}

}
