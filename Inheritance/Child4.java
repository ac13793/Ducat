/*Multilevel Inheritance*/

class Base 
{
   //int x=50;
  void show()
  {
	
	System.out.println("Base");
System.out.println(x);	
//System.out.println(this.x);	

}	
}

class Child4 extends Base
{
  int x=20;
/*
  void show(int x)
  {
	System.out.println("Child");
	System.out.println(x);
	System.out.println(this.x);
	super.show(x);
  }*/

  public static void main(String ...s)
  {
     Child4 c=new Child4();
	 c.show();
  }
}