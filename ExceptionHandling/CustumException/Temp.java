class Temp
{
	int age;
	void get(int age)throws ArithmeticException
	{
		if(age<18)
		{
			throw new AgeException("invalid age");
		}
		else
		{
			this.age=age;
		}
	}
	
	public static void main(String ...s)
	{
		Temp t=new Temp();
		try
		{
			t.get(10);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
	}
}

class AgeException extends Exception
{
	AgeException(String s)
	{
		super(s);
	}
}