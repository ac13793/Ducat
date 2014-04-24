class Thread3 extends Thread
{
	int x;
	
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println(Thread.currentThread().getName() + " " +  x);
			try
			{
				Thread.sleep(1000);
			}catch(Exception e)
			{
			}
		}
	}
}
