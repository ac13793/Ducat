class InitBlock
{
  /*Init block
	Always run before constructor
	because init block is inserted into the constructor as a first line
  */
	int x;
	{
		x=40;
	  System.out.println("from init block"); 
	}
	
	
	{
	  System.out.println("from second init block"); 
	}
	
	
	
	InitBlock()
	{
	System.out.println("from constructor");
	 
	}
	InitBlock(int x)
	{
	  System.out.println("from parameterised constructor  x="+x);	// local variables have more priority than class variables
	}
 
  public static void main(String ...s)
  {
    new InitBlock();
	new InitBlock(10);
	new InitBlock();
  }
}