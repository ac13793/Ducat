class Base
{
	int x;
	int y;
	void show()
	{
	  System.out.println(x);
	  System.out.println(y);
	}

}

class Child extends Base
{
	void set(int x, int y)
	{
			this.x=x;
			this.y=y;
	}
	
  public static void main(String ...s)
  {
    Child c1=new Child();
	c1.set(10,20);
	c1.show();
  }
}