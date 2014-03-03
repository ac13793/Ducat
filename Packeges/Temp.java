//javac -d . Temp1.java will create package p1
// javac -d . Temp2.java will create package p2
// java p2.Temp2 

package p;
public class Temp
{
	public void show()
	{
		System.out.println("from folder 2 Temp class");
	}
  public static void main(String ...g)
  {
   Temp t=new Temp();
	t.show();   
  }
}
  