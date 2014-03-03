interface My extends My1
{
	void show();
}

interface My1
{
	void display();
}

class Child2 implements My
{
	public void show()
	{
		System.out.println("show");
	}
	public void display()
	{
		System.out.println("Display");
	}
	
  public static void main(String ...s)
  {
	Child2 c=new Child2();
	c.show();
	c.display();
  }
}