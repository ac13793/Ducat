class ConstructorChaning
{
	ConstructorChaning()
	{
	this(10);//this() will be the first statement in any constructor
	System.out.println("Default");
	
	}
	
	ConstructorChaning(int x)
	{
	  this(20,30);
	  System.out.println(x);
	}
	
	ConstructorChaning(int x, int y)
	{
	System.out.println("x:: "+x+"y::"+y);
	}
	
	
  public static void main(String ...g)
  {
    ConstructorChaning c=new ConstructorChaning();
	
  }
}