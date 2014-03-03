class Munni
{
	static String s;
	static String p;
	static String c;
	
	
	void set(String x, String y, String z)
	{
	  s=x;
	  p=y;
	  c=z;
	}
	
	void show()
	{
	  System.out.println(s);
	  System.out.println(p);
	  System.out.println(c);
	}
	
	public static void main(String ...a)
	{
		Munni m=new Munni();
		m.set("lalu","101","TCS");
		m.show();
		
	  System.out.println(s);
	  System.out.println(Munni.s);
	}
}