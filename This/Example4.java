class Example4
{
  int x=10;
  void show(int y)
  {
    System.out.println(this);//this will print same value as e 
	System.out.println(this.x);//ab to had hi ho gai humne to object pass hi nhi kiya ,to ye print kaha se kr rha hai
	//i.e in function calling reference id passed it self implicitly
  }
  public static void main(String ...s)
  {
    Example4 e=new Example4();
	System.out.println(e);
	e.show(20);
	
  }
}