class Base
{

	void show()
	{
		System.out.println("Base");
	}
	
}

class DownCasting extends Base
{
	
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
	  Base b=new DownCasting();
	  b.show();
	 // b.display(); can not access
	 DownCasting d=(DownCasting)b; //downCasting  for this first there must be UpCasting
	 d.display();
	  
	  
	}
}