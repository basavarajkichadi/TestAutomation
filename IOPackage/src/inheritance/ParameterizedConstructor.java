package inheritance;
class parent1
{
	parent1(int age)
	{
		System.out.println("Age is"+age);
	}
}
class child1 extends parent1
{

	child1(int age) {
		super(age);
		System.out.println("Child class");
	}
}

public class ParameterizedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		child1 ch=new child1(99);

	}

}
