/*
private data member can not inherit

but what about this program
*/

class Dhoka
{
	private int x=10;
	void show()
	{
	  System.out.println(x);
	}

}

class Child2 extends Dhoka
{
  public static void main(String ...s)
  {
    Child2 c1=new Child2();
	c1.show();
  }
}