package multilevel;
class gp1
{
	gp1(String name)
	{
		System.out.println("Grand parent");
	}
	gp1(int age)
	{
		System.out.println("Grand parent2");
	}
}
class parent1 extends gp1
{
	parent1(String name)
	{
		super(name);
		System.out.println(" parent");
	}
	parent1(int age)
	{
		super(age);
		System.out.println(" parent");
	}
	
}
class child1 extends parent1
{
	child1(String name)
	{
		super(name);
		System.out.println("Child");
	}
	child1(int age)
	{
		super(age);
		System.out.println("Child");
	}
}

public class ConstuctorOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 ch=new child1("modi");
		child1 ch1=new child1(25);

	}

}
