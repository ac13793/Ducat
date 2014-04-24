class Temp8
{
	void xyz()
	{
		display();
	}
	void display()
	{
		show();
	}
	void show()
	{
		int x=10/0;
	}
	public static void main(String ...s)
	{
		Temp8 t=new Temp8();
		try
		{
			t.xyz();
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			e.printStackTrace();
		}
	}
}