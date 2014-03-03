/*Data Hiding*/
class Parent
{ 
	int x=50;
	void show()
	{
	  System.out.println(this);
	  System.out.println(this.x);
	  
	}
  
}
class DataHiding3 extends Parent
{
  int x=20;
  
  public static void main(String ...s)
  {
	  DataHiding3 d=new DataHiding3();
	  d.show();
  }
}