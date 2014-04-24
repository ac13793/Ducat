class RunThread2 
{
	public static void main(String ...s)
	{
		Thread21 t1=new Thread21();
		Thread tt1=new Thread(t1,"Thread 1");
		tt1.start();
		Thread tt2=new Thread(t1,"Thread 2");
		tt2.start();
	}
}