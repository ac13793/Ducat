class Base
{
	static void show()
	{
		System.out.println("parent show");
	}
}

class Child1
{
	// void show() hum to error dege
	static void show()
	{
		System.out.println("child show");
	}
	public static void main(String ...s)
	{
		//Child1 c=new Child1();
		show();
	}
}