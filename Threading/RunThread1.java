class Thread1 extends Thread
{
	Thread1(String s)
	{
		super(s);
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName());
		}
	}
}

class Thread2 extends Thread
{
	Thread2(String s)
	{
		super(s);
	}
	
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println(getName());
		}
	}
}

class Thread3 extends Thread
{
	Thread3(String s)
	{
		super(s);
	}
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(getName());
		}
	}
}

class RunThread1
{
	public static void main(String ...s)
	{
		Thread1 t1=new Thread1("Thread1");
		Thread1 t2=new Thread1("Thread2");
		Thread1 t3=new Thread1("Thread3");
		
		t1.start();
		t2.start();
		t3.start();
		
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread());
		}
	}
}




