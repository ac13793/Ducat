/*NON-STATIC NESTED CLASS
s
*/
class Outer4
{
	int x=10;
	static int y=20;
	
	class Inner
	{
		void show()
		{
			
			System.out.println(x); 
			System.out.println(y);
		}
		
	}
	
	public static void main(String ...g)
	{
		System.out.println(y);
		Outer4 o=new Outer4();
		System.out.println("from outer"+o.x);
		
		Outer4.Inner i=o.new Inner();
		i.show();
	}
}


