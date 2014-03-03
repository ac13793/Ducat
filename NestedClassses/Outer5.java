/*NON-STATIC NESTED CLASS

*/
class Outer5
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
			System.out.println(Outer5.this.x);
		}
		/*not allowed in non-static nested class
		public static void main(String ...g)
		{
			System.out.println("Hello Ankit");
		}
		*/
	}
	
	public static void main(String ...g)
	{
		System.out.println(y);
		Outer5 o=new Outer5();
		System.out.println("from outer"+o.x);
		
		Outer5.Inner i=o.new Inner();
		i.show();
	}
}


