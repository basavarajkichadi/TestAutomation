package abstractclass;
abstract class sample
{
	public abstract void display();
	static void displaunum()
	{
		System.out.println("Abstract Method");
	}
}
class sample1 extends sample
{
	public void display() {
	System.out.println("Abstract method from parent method");
	}	
}

public class SI_abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sample1 s=new sample1();
		sample.displaunum();
		s.display();

	}

}
