/*
can we keep main function on it

*/

class Outer2
{
	int x=10;
	static int y=20;
	
	static class Inner
	{
		static void show()
		{
			// non-static variable x cannot be referenced from a static context
			//System.out.println(x); 
			System.out.println(y);
		}
		public static void main(String ...g)
		{
			System.out.println("Hello Ankit");
		}
	}
	
	public static void main(String ...g)
	{
		System.out.println(y);
		Inner.show();
	}
}

class Temp extends Outer2
{
	public static void main(String ...s)
	{
		System.out.println("from Temp");
		Outer2.Inner.show();
		//2nd method
		System.out.println("2nd method");
		Outer2.Inner i=new Outer2.Inner();
		i.show();
		//3rd method
		System.out.println("2n method");
		Inner i2=new Inner();
		i2.show();
		
		
	}
}

