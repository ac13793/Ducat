class Temp7
{
	int age;
	void get(int age)
	{
		if(age<18)
		{
			try
			{
				throw new ArithmeticException("invalid input");
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
			}
		}
		else
		{
			this.age=age;
		}
	}
	public static void main(String ...s)
	{
		Temp7 t=new Temp7();
		t.get(10);
	}
}