class Length
{	
	public static void main(String ...g)
	{
		String s = "foo";
		char arr[]=s.toCharArray();
		int len = 0;
		for(char single : arr){
		  len++;
		}
		System.out.println(len);
	}
}