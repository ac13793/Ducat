class Temp
{
  final int x;//errr ni dege kyunki hume to constructer initialize ker rhe hai
  Temp(int x)
  {
	this.x=x;
  }
  public static void main(String ...s)
  {
     Temp t1=new Temp(10);
	 System.out.println(t1.x);
	// t1.x=t1.x+20;  na bhai ye na change hoi
	 
     Temp t2=new Temp(20);
	 System.out.println(t2.x);
	 
  }
}