class Temp
{
   //static int x=10;  static initialization of static data member
   
   /*
   Dynamic initialization of static data memeber
   */
   static int x;
   static	//execute at the class load time
   {
     try{
     x=System.in.read();  //take a char input and return ASCII value of the character
	 }catch(Exception e)
	 {
	 }
   }
   
}

class StaticBlock
{
  public static void main(String ...s)
  {
		System.out.println(Temp.x);		//load a class Temp and execute static block
		System.out.println(Temp.x);		//class already loaded so static block will not executed
  }
}

class Temp1
{
  public static void main(String ...g)
  {
  
    System.out.println(Temp.x);
  }
}