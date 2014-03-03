class CopyConstructor
{
  int x;
  int y;
  CopyConstructor(int x ,int y)
  {
    this.x=x;
	this.y=y;
  }
  CopyConstructor(CopyConstructor z)
  {
    this.x=z.x;
	this.y=z.y;
  }
  void show()
  {
    System.out.println(x);
	System.out.println(y);
  }
  public static void main(String ...s)
  {
    CopyConstructor d1=new CopyConstructor(10,20);
	d1.show();
	CopyConstructor d2=new CopyConstructor(d1); //this is a concept of passing a refId of d1 to d2
	d2.show();
  }
}