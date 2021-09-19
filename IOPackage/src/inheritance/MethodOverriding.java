package inheritance;

class parent3
{
	public void dispaly(int age)
	{
		System.out.println("age is: "+age);
	}
}
class child3 extends parent3
{
	public void dispaly(int age)
	{
		System.out.println(" Child class age is: "+age);
	}
}

public class MethodOverriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 parent3 ch=new  child3();
		 ch.dispaly(20);
	}

}
