class AzabGazab1
{
	public static void main(String ...s)
	{
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Hello");
		if(s1==s2)
		{
			System.out.println("s1 and s2 are equal");
		}
		if(s1==s3)
		{
			System.out.println("s1 and s3 are equal");
		}
		else
		{
			System.out.println("s1 and s3 are not equal");
		}
	}
}