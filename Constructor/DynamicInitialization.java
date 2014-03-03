class DynamicInitialization{

  int x;
  int y;
  DynamicInitialization(int x ,int y){
  
    this.x=x;//initialised instance variable x
	y=y;//local variable y 
	System.out.println("From constructor :: this.x::"+this.x);
	System.out.println("From constructor :: x and y::"+x+","+y);
  }
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
  
  public static void main(String ...s)
  {
   DynamicInitialization s1=new DynamicInitialization(10,20);
   s1.show();
   DynamicInitialization s2=new DynamicInitialization(100,200);
   s2.show();
  }
}