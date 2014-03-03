/*
having different argument
*/

class Overload1
{
  
  void show()
  {
    System.out.println("No argument");
  }
  
   void show(String s)
  {
    System.out.println("one argument"+" "+s);
  }
   void show(int a ,int b)
  {
    System.out.println("two arguments:"+a+"and"+b);
  }
   void show(String s, int a , int b)
  {
    System.out.print("three argument::  ");
	System.out.println(s+" , "+a+"," +b);
  }


  public static void main(String ...s)
  {
    Overload1 o1=new Overload1();
	o1.show();
	o1.show("jss");
	o1.show(10,20);
	o1.show("Sum",10,20);
  }
  
  
}