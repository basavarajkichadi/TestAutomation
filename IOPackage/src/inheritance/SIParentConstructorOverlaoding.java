package inheritance;
class parent2
{
	parent2(int age)
	{
		System.out.println("Parent class");
	}
	parent2(String name)
	{
		System.out.println("Parent2 class");
	}
}
class child2 extends parent2
{
	child2(int age)
	{
		super(age);
		System.out.println("Child class");
	}
	child2(String name)
	{
		super(name);
		System.out.println("Child2"
				+ " class");
	}
}

public class SIParentConstructorOverlaoding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child2 ch=new child2(25);
		child2 ch1=new child2("kalam");

	}

}
