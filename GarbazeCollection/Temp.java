class Temp
{
	public static void main(String ...s)
	{
		Runtime rt = Runtime.getRuntime();
		System.out.println(rt.totalMemory());
		System.out.println(rt.freeMemory());
		
	}
}