/*
Anonymous classes
2nd method
*/
class Outer2 implements My
{
  int x=10;
  static int y=20;
  
	public void show()
	{
		System.out.println("from show of Outer class");
	}
   void display(My m)
  {
	m.show();//show() function at line 30 running from here
    System.out.println("from outer display y = "+y);
	System.out.println("from outer display x = "+x);
	
  }
  
  public static void main(String ...s)
  {
	
	Outer2 o=new Outer2();
	o.display(new My()
		{
			public void show()
			{
				System.out.println("from show of My interface y = "+y);
			}
		}
	
	);
	o.show();	//show() function at line 10 running from here
	My z=new My(){
		public void show()
		{
			System.out.println("from another show  y= "+y);
		}
	};
	z.show();
	
  }
}

interface My
{
  void show();
}