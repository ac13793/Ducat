class StaticInitialization{

  int x;
  int y;
  StaticInitialization(){
  
    x=10;
	y=20;
  }
  void show()
  {
    System.out.println(x);
    System.out.println(y);
  }
  
  public static void main(String ...s)
  {
   StaticInitialization s1=new StaticInitialization();
   s1.show();
   StaticInitialization s2=new StaticInitialization();
   s2.show();
  }
}