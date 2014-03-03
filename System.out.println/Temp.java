/*
consider 
Temp=System
Demo=PrintStream
void show(){}=void println(){}
*/

class Temp
{
  static Demo d;
  static
  {
    d=new Demo();
  }
  
}

class Demo
{
  void show(int x)
  {
    System.out.println(x);
  }
}

class Temp1
{
  public static void main(String ...s)
  {
    Temp.d.show();
	
  }
}