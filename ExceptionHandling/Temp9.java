class Demo
{
	int  divide(int x,int y)throws ArithmeticException
	{
		return x/y;
	}
		
}

class Temp9
{
	public static void main(String ...g)
	{
		Demo d=new Demo();
		int r=d.divide(10,0);
		System.out.println(r);
	}
}