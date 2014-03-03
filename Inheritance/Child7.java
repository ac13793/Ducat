/*
achieving function overriding by changing its return type possible after jJDK 1.4
*/

class Base
{
	A show()
	{
		System.out.println("A class");
		return new A();
	}
}

class Child7 extends Base
{
	B show()
	{
		System.out.println("B class");
		System.out.println("return from parent show"+super.show());
		
		return new B();
	}
	
  public static void main(String ...s)
  {
	Child7 c=new Child7();
	c.show();
  }
}

class A
{
}
class B extends A
{
  
}