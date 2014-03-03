class Majak
{
	int x=10;
	void show()
	{
	  System.out.println(Majak.this.x);
	}
	public static void main(String ...s)
	{
	  //System.out.println(Majak.this.x);
	  new Majak().show();
	}
}