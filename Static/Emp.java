/*
static variables
*/

class Emp
{
	static String cName="TCS"; //can directly access only in static methods
	String eName;	//these non-static variable can only access in instance or non-static function
	int eSalary;
	public void get(String n1, int s1)
	{
	eName=n1;
	eSalary=s1;
	}
	
	public void show()
	{
	 //System.out.println(cName);   access only in static methods
	// System.out.println(e1.eName);  this will give error because e1 is a reference variable (local variable ) in a function
	System.out.println("from get function"+" "+eSalary);
	}
	
  public static void main(String ...g)
  {
    Emp e1=new Emp();
	e1.get("Ankit",50000);
	e1.show();
	 System.out.println("e1.eName:: from main function"+" "+e1.eName);
	 // System.out.println("eName::from main function"+eName);   non-static variable can not directly access from any function
	  System.out.println("Company name::"+" "+cName);  // main is  a static method so we can directly access here
	//System.out.println();
	
  }
}