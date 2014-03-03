class Outer
{
	int x=10;
	static int y=20;
	
	static class Inner
	{
		void show()
		{
			// non-static variable x cannot be referenced from a static context
			//System.out.println(x); 
			System.out.println(y);
		}
	}
	
	public static void main(String ...g)
	{
		System.out.println(y);
		Inner i=new Inner();
		i.show();
	}
}