

class Base
{
	public Base show()
	{
		System.out.println("A class");
		return new Base();
	}
}

class Child1 extends Base
{
	public Child1 show()
	{
		System.out.println("B class");
		System.out.println("return from parent show"+super.show());
		
		return this;
	}
	
  public static void main(String ...s)
  {
	Child1 c=new Child1();
	c.show();
  }
}