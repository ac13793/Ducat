class Demo
{
	int x=10;
	int y=20;
	//Temp2 t=new Temp2();
	//System.out.println(d.z);
	//System.out.println(t.x);
	//System.out.println(t.y);
	//System.out.println(t.z);
	
}

class Temp2 extends Demo
{
	int z=40;
	public static void main(String ...s)
	{
		Demo d=new Demo();
		Temp2 t=new Temp2();
		System.out.println(d.x);
		System.out.println(d.y);
		//System.out.println(d.z);
		System.out.println(t.z);
		System.out.println(t.x);
		System.out.println(t.y);
	}
}