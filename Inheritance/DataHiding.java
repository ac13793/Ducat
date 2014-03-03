/*Data Hiding*/
class Parent
{ 
	int x=50;
	
  
}
class DataHiding extends Parent
{
  int x=20;
  void show()
	{
	  System.out.println(x);
	  //System.out.println(super.x);  will print value of x from the parent class
	}
  public static void main(String ...s)
  {
	  DataHiding d=new DataHiding();
	  d.show();
  }
}