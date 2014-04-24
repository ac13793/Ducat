class Azabgazab2
{
	int show()
	{
		try
		{
			int x=10/0;
			return x;
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		finally
		{
			return 20;
		}
	}
	public static void main(String ...s)
	{
		Azabgazab2 a=new Azabgazab2();
		int x=a.show();
		System.out.println(x);
	}
}