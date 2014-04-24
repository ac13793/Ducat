class Temp4
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
		catch(ArithmeticException | ArrayIndexOutOfBoundsException e)
		//catch(Exception | ArrayIndexOutOfBoundsException e) not allowed both the class must parallel to each other
		{
			System.out.println(e);
		}
		
	}
}