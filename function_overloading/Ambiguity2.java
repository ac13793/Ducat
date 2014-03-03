/*
Ambiguity error due to opposite argument
*/

class Ambiguity2
{

  void show()
  {
    System.out.println("No argument");
  }

   void show(int a,int b)
  {
    System.out.println(" datatype void::"+" "+a+" , "+b);
  }
   int show(int a,int b)
  {
    System.out.println(" datatype int::"+" "+a+" , "+b);
  }
  

  public static void main(String ...s)
  {
    Ambiguity2 o1=new Ambiguity2();
	o1.show();
	//o1.show(10,10l);
	//o1.show(10l,10);
	o1.show(10,10);	//give ambiguity error

  }


}