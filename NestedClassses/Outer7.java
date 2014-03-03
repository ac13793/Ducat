/*
inner class
*/
class Outer7
{
  int x=20;
  static int y=50;
  void display()
  {
	class Inner
	{
		void show()
		{
			System.out.println("from inner");
		}
	}
	Inner i=new Inner();
	i.show();
	
  }
  
  public static void main(String ...g)
  {
	Outer7 o=new Outer7();
	o.display();
	//problem how we can run show of Inner class from here (Ans. in Outer8.java)
	
  }
}
