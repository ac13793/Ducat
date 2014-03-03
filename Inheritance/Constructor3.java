class A
{
	A()
	{
		System.out.println("A");
	}
}
class B extends A
{
	B(int x)
	{
		System.out.println("B"+" "+ x);
	}
}
class Constructor3 	extends B
{
	Constructor3()
	{
			super(10);	
			System.out.println("Constructor");
	}
	public static void main(String ...s)
	{
	  Constructor3 c=new Constructor3();
	}
}