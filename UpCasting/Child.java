class Base
{
	int x=50;
	void show()
	{
		System.out.println("Base");
	}
	
}

class Child extends Base
{
	int x=20;
	void show()
	{
		System.out.println("child");
		//super.show();
	}
	
	void display()
	{
		System.out.println("display");
	}
	
	
	public static void main(String ...s)
	{
	  Base b=new Child();
	  b.show();
	  System.out.println(b.x);	//data member con not be overridden
	}
}