package collectionpackage;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) { 
		// TODO Auto-generated method stub
		Stack st=new Stack();

		pushDemo(st,100);
		pushDemo(st,200);
		pushDemo(st,300);
		pushDemo(st,400);
		pushDemo(st,500);
		popDemo(st);
		popDemo(st);
		popDemo(st);
		popDemo(st);
	}
	static void pushDemo(Stack st,int a)
	{
		st.push(a);
		System.out.println("Element: "+a);
	}
	static void popDemo(Stack st)
	{
		int a=(int)st.pop();
		System.out.println("Removed Elements: "+a);
	}
}


