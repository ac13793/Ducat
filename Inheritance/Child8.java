/*
achieving function overriding by changing its return type possible after jJDK 1.4
*/

class Base
{
	Base show()
	{
		System.out.println("A class");
		return new Base();
	}
}

class Child8 extends Base
{
	Child8 show()
	{
		System.out.println("B class");
		System.out.println("return from parent show"+super.show());
		
		return this;
	}
	
  public static void main(String ...s)
  {
	Child8 c=new Child8();
	c.show();
  }
}