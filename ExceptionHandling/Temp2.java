class Temp2
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
		/*
		not allowed becoz they must be in child to parent order
		catch(Exception e)
		{
			System.out.println(e);
		}
		*/
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}