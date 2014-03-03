class A
{
	A()
	{
		System.out.println("A");
	}
}
class B extends A
{
	B()
	{
		System.out.println("B");
	}
}
class Constructor 	extends B
{
	Constructor()
	{
			System.out.println("Constructor");
	}
	public static void main(String ...s)
	{
	  Constructor c=new Constructor();
	}
}