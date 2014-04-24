class Demo
{
	int  divide()throws ArithmeticException,IOException
	{
		int a=System.inread();
		int b=System.inread();
		
		return a/b;
	}
		
}

class Temp10
{
	public static void main(String ...g)
	{
		Demo d=new Demo();
		int r=d.divide();
		System.out.println(r);
	}
}