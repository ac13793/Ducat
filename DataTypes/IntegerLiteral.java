class IntegerLiteral
{
   public static void main(String ...s)
   {
		byte d=20;  //will not give compilation error
	
    System.out.println(d);
   
   
   
   
     IntegerLiteral il=new IntegerLiteral();
	 //we pass a literal 10 in a method show
	 il.show(10);//In java default literal type is Int so this function call show(int i)
	 //il.show(10L);//to call a function which taking argument of long type
	 //byte b=10;
	 //il.show(b);//for call a byte function
	 
   }
   
   public void show(byte b)
   {
   System.out.println("Hello byte");
   }
   
	public void show(short s)
   {
   System.out.println("Hello short");
   }
   
   public void show(int i)
   {
   System.out.println("Hello int");
   }
   
   public void show(long l)
   {
   System.out.println("Hello long");
   }   
   
}