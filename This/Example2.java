class Example2 //output ::
{
   int x=10;
   void show(int y , Example1 z)
   {
	 System.out.println(y);
     System.out.println(x);
	 System.out.println(z.x);  //this will print same value as x
   }
  public static void main(String ...s)
  {
    Example2 e=new Example2();
	e.show(20,e); 
  }
}
