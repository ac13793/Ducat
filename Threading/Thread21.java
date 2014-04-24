class Thread21 extends Thread
{
	int x=0;
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName());
		}
	}
}
