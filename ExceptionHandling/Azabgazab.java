class Azabgazab
{
	int show()
	{
		try
		{
			return 10;
		}
		finally
		{
			return 20;
		}
	}
	public static void main(String ...s)
	{
		Azabgazab a=new Azabgazab();
		int x=a.show();
		System.out.println(x);
	}
}