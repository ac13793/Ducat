class StringBufferKaMaza
{
	public static void main(String ...s)
	{
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("a");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		sb.append("aaaaaaaaaaaaaaaa");	// after appending 16 character  this will become 17
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		//insert 40 char at one time
		StringBuffer sb2=new StringBuffer();
		sb2.append("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
		sb2.append("a");
		System.out.println(sb2.length());
		System.out.println(sb2.capacity());
	}
}