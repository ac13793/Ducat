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
class Constructor2 	extends B
{
	Constructor2()
	{
			super();	// ye to compiler implicitly laga rha hai tm lagao ya na lagao
			System.out.println("Constructor");
	}
	public static void main(String ...s)
	{
	  Constructor2 c=new Constructor2();
	}
}