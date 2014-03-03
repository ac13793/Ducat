/*
static functions
*/

class Emp1
{
	static String cName; //can directly access only in static methods
	String eName;	//these non-static variable can only access in instance or non-static function
	int eSalary;
	public static void get(String n1,String n2, int s1)
	{
		//eName=n1;//non static varible can not access here
		cName=n2;  
		//eSalary=s1;  //non static varible can not access here
	}
	
	public void test(String n1,String n2, int s1)
	{
	 eName=n1;//non static varible can not access here
		//cName=n2;  
		eSalary=s1;  //non static varible can not access here
	}
	
	public  void  show()
	{
	 //System.out.println(cName);   access only in static methods
	// System.out.println(e1.eName);  this will give error because e1 is a reference variable (local variable ) in a function
	System.out.println("from show function"+" "+eSalary);
	System.out.println("company name from show::"+" "+ eName);
	
	}
	
	
  public static void main(String ...g)
  {
    Emp1 e1=new Emp1();
	e1.get("Ankit","TCS",50000);
	get("Ankit","TCS",50000);// directly access without associated with e1
	e1.test("chaurasia","TCS",50000);
	e1.show();
	 System.out.println("e1.eName:: from main function"+" "+e1.eName);
	 // System.out.println("eName::from main function"+eName);   non-static variable can not directly access from any function
	  System.out.println("Company name::"+" "+cName);  // main is  a static method so we can directly access here
	  System.out.println(e1);
	//System.out.println();
	
  }
}