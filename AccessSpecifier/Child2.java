

class Base
{
	private Base show()
	{
		System.out.println("A class");
		return new Base();
	}
}

class Child2 extends Base
{
	public Child2 show()
	{
		System.out.println("B class");
		//System.out.println("return from parent show"+super.show());  parent class has a private method can not override
		
		
		return this;
	}
	
  public static void main(String ...s)
  {
	Child2 c=new Child2();
	c.show();
  }
}