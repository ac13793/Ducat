/*
you can also create a function with class name
*/
class Dhoka{

	Dhoka()
	{
	  System.out.println("From constructor");
	  
	}

	void Dhoka()
	{
	 System.out.println("from function");
	}
  public static void main(String ...s)
  {
    Dhoka d=new Dhoka();//only call constructor
	new Dhoka().Dhoka(); //call both constructor and function
	
  }
}