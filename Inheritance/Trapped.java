class Base
{
  int x=50;
  void show()
  {
    System.out.println("Base");
  }
}
/*Trapped here*/
class Trapped extends Base
{
   void show()
  {
    System.out.println("Trapped");
	super.show();
	System.out.println(((Base)this).show());	/*Trapped here*/
	
  }
  public static void main(String ...s)
  {
    Trapped t=new Trapped();
	t.show();
  }
}