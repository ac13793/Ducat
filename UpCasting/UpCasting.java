class Base
{

	void show()
	{
		System.out.println("Base");
	}
	
}

class UpCasting extends Base
{
	/*
	void show()
	{
		System.out.println("child");
		//super.show();
	}
	*/
	public static void main(String ...s)
	{
	  Base b=new UpCasting();
	  b.show();//if Base class doesn't have show then compiler will not search in the child class
	  //super.show(); non-static variable super can not be call
	}
}