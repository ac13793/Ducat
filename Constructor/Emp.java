class Emp
{
  Emp()
  {
    System.out.println("From constructor:: "+this);
  }
  public static void main(String ...s)
  {
    Emp e=new Emp();
	System.out.println("From main function ::"+e);
  }
}