class DefaultValue
{
   byte b;
   short s;
   int a;
   long l;
   float f=0.0f;
   double d;
   boolean boo;
   static char c;
   String str;
  public static void main(String ...s)
  {
    DefaultValue r=new DefaultValue();
	r.show();
	System.out.println("Object value ::"+r);
	System.out.println("char " +DefaultValue.c+1);
  }
  public void show()
  {
   System.out.println("Byte ::"+b+"\nShort ::"+s+"\nInt ::"+a+"\nlong ::"+l+"\nFloat ::"+f+"\nDouble ::"+d+"\nBoolean ::"+boo+"\nString ::"+str);
	
  }
}