/*
a function which execute before the constructor
*/

class Day16
{

  int x=getX();
  int getX()
  {
    System.out.println(this.x+" via get function");
	return 10;
  }
  
  Day16()
  {
    System.out.println(this.x+" via constructor");
  }
  public static void main(String ...s)
  {
    Day16 d=new Day16();
	
  }
}