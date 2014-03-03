/*Multilevel Inheritance*/
class Dadaji
{
	int x=80;
}

class Base extends Dadaji
{
	int x=50;
}

class Child extends Base
{
	int x=20;
	void show()
	{
		System.out.println(x);
		System.out.println(super.x);
		System.out.println(x);
		System.out.println("show"+((Dadaji)this).x);
	}
	
	public static void main(String ...s)
	{
		Child c=new Child();
		c.show();
		System.out.println(((Dadaji)c).x);
	}
}