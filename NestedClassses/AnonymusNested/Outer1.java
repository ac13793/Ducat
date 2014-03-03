/*
Anonymour classes
1st method
*/
class Outer1 implements My
{
  int x=10;
  static int y=20;
  
  public void show()
  {
    System.out.println("from show of Outer class");
  }
  
  My display()
  {
    System.out.println("from outer display y = "+y);
	System.out.println("from outer display x = "+x);
	return ( new My()
		{
			public void show()
			{
				System.out.println("from show of My interface y = "+y);
			}
		}
	);
  }
  
  public static void main(String ...s)
  {
	/* simple
	My m=new Outer1();
	m.show();
	*/
	Outer1 o=new Outer1();
	o.show();
	My m=o.display();
	m.show();
	
  }
}

interface My
{
  void show();
}