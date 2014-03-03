class Example3 //output ::
{
   int x=10;
   void show(int y , Example3 z)
   {
	 System.out.println(y);
     System.out.println(x);
	 System.out.println(this.x);  //this will print same value as x
   }
  public static void main(String ...s)
  {
    Example3 e=new Example3();
	//e.show(20,this);   this is not true you can not pass this as a argument
	e.show(20,e);
  }
}