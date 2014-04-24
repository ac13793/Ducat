class Temp3
{
	public static void main(String ...s)
	{
		try
		{
			int x=10/s.length;
			System.out.println(x);
			int z[]=new int[s.length];
			z[10]=100;
		}
		catch(Exception e)
		{
			if(e.instanceOf ArithmeticException)
			{
				System.out.println(e);
			}
			if(e.instanceOf ArrayIndexOutOfBoundsException)
			{
				System.out.println(e);
			}
			
		}
		
	}
}