class Pappu
{
  Pappu()
  {
    this(10);
	System.out.println("from constructor");
  }
  
  Pappu(int x)
  {
    System.out.println("from second constructor");
  }
  {
	System.out.println("init block");
  }
  
  public static void main(String ...s)
  {
    new Pappu();
  }
}