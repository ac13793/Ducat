/*
can you directly inherited inner class
*/
class Outer3
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

class Temp extends Outer3.Inner
{
	public static void main(String ...s)
	{
		System.out.println("from Temp");
		Outer3.Inner.show();
		//2nd method
		System.out.println("2nd method");
		Outer3.Inner i=new Outer3.Inner();
		i.show();
		//3rd method
		/*not possible
		System.out.println("3rd method");
		Inner i2=new Inner();
		i2.show();
		*/
		//4th method
		Temp t=new Temp();
		t.show();
		
	}
}

