/*Multilevel Inheritance*/
class Dadaji
{
  int x=80;
}

class Base extends Dadaji
{
  int x= 50;
}

class Child3 extends Base
{
  int x=20;
  void show()
  {
    System.out.println(x);
	System.out.println(this.x);
	System.out.println(super.x);
	System.out.println(((Dadaji)this).x);
  }
  public static void main(String ...s)
  {
     Child3 c=new Child3();
	 System.out.println(((Dadaji)c).x);
	 c.show();
  }
}