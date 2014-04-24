class Demo
{
	int x=10;
	int y=20;
	
	static void show()
	{
		Demo d2 = new Demo();
		display();
	}
	static void display()
	{
		Demo d3 = new Demo();
	}
}

class Temp1 extends Demo
{
	public static void main(String ...s)
	{
		Demo d=new Demo();
		show();
	}
}