class Temp6
{
	public static void main(String ...s)
	{
		try
		{
			int x=10/s.length;
			System.out.println(x);
			//Nested try catch
			try
			{
				int z[]=new int[s.length];
				z[10]=100;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
			}
			
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		
	}
}