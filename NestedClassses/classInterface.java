
class classInterface implements My1
{
 public static void main(String ...g)
 {
	z.show();
	Inner i=new Inner();
	i.display();
 }
}

interface My1 
{
	My z = new My(){
					public void show()
					{
					  System.out.println("anonymous");
					}
	};
	
	class Inner
	{
	   void display()
	   {
	     System.out.println("Static nested class in interface");
	   }
	}
	
}

class Temp extends My1.Inner
{
	public static void main(String ...s)
	{
		new Temp().display();
	}
}

interface My
{
  void show();
}