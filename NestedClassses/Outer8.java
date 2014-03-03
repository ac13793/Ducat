/*
inner class
*/
interface My
{
	void show();
}
class Outer8
{
  int x=20;
  static int y=50;
  My display()
  {
	class Inner implements My
	{
		public void show()
		{
			System.out.println("from inner");
		}
	}
	My i=new Inner();
	return i;
	
  }
  
  public static void main(String ...g)
  {
	Outer8 o=new Outer8();
	My z=o.display();
	z.show();
	//problem how we can run show of Inner class from here (Ans. in Outer8.java)
	
  }
}
