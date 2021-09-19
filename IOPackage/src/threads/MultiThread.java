package threads;

class MyThread1 implements Runnable
{
	public void run()
	{
		evennumbers();
	}
	synchronized public static void evennumbers()
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

public class MultiThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread1 job=new  MyThread1();
		Thread t1=new Thread(job);
		Thread t2=new Thread(job);
		Thread t3=new Thread(job);
		t1.setName("Alpha");
		t1.start();
		t2.setName("Beta");
		t2.start();
		t3.setName("Gama");
		t3.start();

		
	}

}
