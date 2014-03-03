/*
having same argument in each funtion but differ in their datatypes
*/

class Overload2
{
  
  void show()
  {
    System.out.println("No argument");
  }
  
   void show(int s)
  {
    System.out.println("one argument with datatype int ::"+" "+s);
  }
   void show(String s)
  {
    System.out.println("one arguments: with String datatype ::"+" "+s);
  }
  void show(long s)
  {
    System.out.println("one arguments: with long datatype ::"+" "+s);
  }
  void show(float s)
  {
    System.out.println("one arguments: with float datatype ::"+" "+s);
  }


  public static void main(String ...s)
  {
    Overload2 o1=new Overload2();
	o1.show();
	o1.show(10);
	o1.show("jss" );
	o1.show(10l);
	o1.show(10.2f);
  }
  
  
}