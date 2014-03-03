/*Data Hiding*/
class Parent
{ 
	int x=50;
	
  
}
class DataHiding_Super extends Parent
{
  int y=20;
  void show()
	{
	  System.out.println(y);
	  System.out.println(x);
	  System.out.println(super.x);  //will print same as of x from the parent class
	  System.out.println(this);
	  //System.out.println(super);  value of super is not print
	}
  public static void main(String ...s)
  {
	  DataHiding_Super d=new DataHiding_Super();
	  d.show();
  }
}