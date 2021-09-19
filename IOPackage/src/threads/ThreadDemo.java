package threads;
class MyThread implements Runnable
{
	public void run()
	{
		evennumbers();
	}
	public static void evennumbers()
	{
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				System.out.println("Evenumber"+i+Thread.currentThread().getName());
			}
		}
	}

}

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread job=new  MyThread();
		Thread t1=new Thread(job);
		t1.setName("Alpha");
		t1.start();
	}

}
