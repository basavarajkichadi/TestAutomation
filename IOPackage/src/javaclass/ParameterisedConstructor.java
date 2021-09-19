package javaclass;

class Animal
{
	String name;
	int age;
	Animal(String name,int age)
	{
		 this.name=name;
		 this.age=age;
		 System.out.println("Name: "+name);
		 System.out.println("age:"+age);
	}
}

public class ParameterisedConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal ani=new Animal("Tiger",10);
		System.out.println("****************");
		Animal ani1=new Animal("lion",25);
	}

}
