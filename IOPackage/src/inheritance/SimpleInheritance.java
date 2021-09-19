package inheritance;
class parent
{
	parent()
	{
		System.out.println("Parent class");
	}
}
class child extends parent
{
	child()
	{
		System.out.println("Child class");
	}
}

public class SimpleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child ch=new child();

	}

}
