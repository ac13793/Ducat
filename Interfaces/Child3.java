interface My extends My1 ,My2
{
	void show();
}

interface My1
{
	void display();
}
interface My2
{
  void ankit();
}

class Child3 implements My
{
	public void show()
	{
		System.out.println("show");
	}
	public void display()
	{
		System.out.println("Display");
	}
	public void ankit()
	{
		System.out.println("Ankit");
	}
	
  public static void main(String ...s)
  {
	Child3 c=new Child3();
	c.show();
	c.display();
	c.ankit();
  }
}