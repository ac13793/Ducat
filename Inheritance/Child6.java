
class Base
{
  int x=50;
  Base show()
  {
    System.out.println("Base");
	return new Base();
  }
}

class Child6 extends Base
{
   Child6 show()
  {
    System.out.println("Child");
	return this;
	
  }
  public static void main(String ...s)
  {
    Child6 t=new Child6();
	t.show();
  }
}