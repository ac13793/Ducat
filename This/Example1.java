/*
try your logic to print both value of x if data shadowing is there*/
class Example1
{
   int x=10;
   void show(int x , Example1 z)
   {
     System.out.println(x);
	 System.out.println(z.x);
   }
  public static void main(String ...s)
  {
    Example1 e=new Example1();
	e.show(20,e);
  }
}