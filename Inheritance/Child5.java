/*after JDk 1.5 return type play rote */
class Base
{
  int x=50;
  A show()
  {
    System.out.println("Base");
	return new A();
  }
}

class Child5 extends Base
{
   B show()
  {
    System.out.println("Child");
	return new B();
	
  }
  public static void main(String ...s)
  {
    Child5 t=new Child5();
	t.show();
  }
}

class A
{
}
class B extends A
{
}