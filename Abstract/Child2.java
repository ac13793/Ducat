abstract class Base 
{
 int x;
 int y;
  void show()
  {
	System.out.println(x);
	System.out.println(y);
  }
  abstract void display();
  
  void register(Base b)
  {
	b.show();
  }
}

class Child2 extends Base
{
  
  void set(int x,int y)
  {
		this.x=x;//data member can not be over ride
		this.y=y;
  }
  //ager override nhi kiya to err aayegi
  void display()
  {
	System.out.println("child display");
  }
  
  public static void main(String ...s)
  {
     Child2 c=new Child2();
	 
	 c.set(10,20);
	 c.register(c);
  }
}