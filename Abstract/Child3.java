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
}

class Child3 extends Base
{
  void set(int x,int y)
  {
		this.x=x;
		this.y=y;
  }
  //ager override nhi kiya to err aayegi
  void display()
  {
	System.out.println("child display");
  }
  
  public static void main(String ...s)
  {
     Base b=new Child3();
	 b.show();
	 
  }
}