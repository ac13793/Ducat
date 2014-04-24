class Intern
{
	public static void main(String ...s)
	{
		String s1= new String("Hello");
		String s2=s1.intern();
		String s3=new String("Hello");
		String s4=s3.intern();
		if(s1==s3)
		{
			System.out.println("s1 and s3 are equal");
		}
		if(s1!=s2)
		{
			System.out.println("s1 and s2 are not equal");
		}
		if(s2==s4)
		{
			System.out.println("s2 and s4 are equal");
		}
	}
}