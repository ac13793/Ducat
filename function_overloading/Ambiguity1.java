/*
Ambiguity error due to opposite argument
*/

class Ambiguity1
{

  void show()
  {
    System.out.println("No argument");
  }

   void show(int a,long b)
  {
    System.out.println(" argument with (int a,long b)::"+" "+a+" , "+b);
  }
   void show(long a,int b)
  {
    System.out.println(" argument with (long a,int b)::"+" "+a+" , "+b);
  }
  

  public static void main(String ...s)
  {
    Ambiguity1 o1=new Ambiguity1();
	o1.show();
	o1.show(10,10l);
	o1.show(10l,10);
	o1.show(10,10);	//give ambiguity error

  }


}