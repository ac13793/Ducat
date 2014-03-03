/*NON-STATIC NESTED CLASS

*/
class Outer6
{
	int x=10;
	static int y=20;
	
	class Inner
	{
		int x=50;
		void show()
		{
			
			System.out.println(x); 
			System.out.println(y);
			System.out.println(this.x);
			System.out.println(Outer6.this.x);
		}
		
	}
	
	public static void main(String ...g)
	{
		System.out.println(y);
		Outer6 o=new Outer6();
		System.out.println("from outer"+o.x);
		
		Outer6.Inner i=o.new Inner();
		i.show();
	}
}

class Temp extends Outer6// extends Outer6.Inner not allowed
{
	public static void main(String ...s)
	{
		System.out.println("from Temp");
		
		Temp t=new Temp();
		System.out.println("from temp value"+t.x);
		Outer6.Inner i=t.new Inner();
		i.show();
		
	}
}


