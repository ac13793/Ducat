class Base
{
  int x=50;
  void show()
  {
    System.out.println("Base");
  }
}
/*Trapped here*/
class Overloading extends Base
{
   int show()
  {
    System.out.println("Child");
	
  }
  public static void main(String ...s)
  {
    Overloading t=new Overloading();
	t.show();
  }
}