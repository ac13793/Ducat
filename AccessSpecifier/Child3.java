

class Base
{
	protected Base show()
	{
		System.out.println("A class");
		return new Base();
	}
}

class Child3 extends Base
{
	public Child3 show()
	{
		System.out.println("B class");
		System.out.println("return from parent show"+super.show()); 
		// protected things of a class can be accessed by inheritance not by association
		
		
		return this;
	}
	
  public static void main(String ...s)
  {
	Child3 c=new Child3();
	c.show();
  }
}