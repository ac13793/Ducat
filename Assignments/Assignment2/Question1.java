class Question1
{
	static void wordCount(String s)
	{
		byte b[] =s.getBytes();
		int count=0;
		for(byte i=0;i<s.length();i++)
		{
			if(b[i]==32)
				count++;
		}
		if(b[s.length()-1]>32)
			count++;
		System.out.println("no. of words in the String is :"+count);
	}
	
	static void spaceCount(String s)
	{
		byte b[] =s.getBytes();
		int count=0;
		for(byte i=0;i<s.length();i++)
		{
			if(b[i]==32)
				count++;
		}
		
		System.out.println("no. of space in the String is :"+count);
	}
	
	static void charCount(String s)
	{
		byte b[] =s.getBytes();
		int count=0,len=0;
		for(byte i=0;i<s.length();i++)
		{
			if(b[i]==32)
				i++;
			else
				len++;
		}
		len++; //becoz loop start from 0
		System.out.println("no. of character in the String is :"+len);
	}
	
	static void reverseString(String s)
	{
		byte b[] =s.getBytes();
		int count=0;
		System.out.println("Reverse String is :");
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		
		System.out.println();
	}
	
	static void palindrome()
	{
		String s1= "nitin";
		String s2="nitin";
		if(s1.length()==s2.length())
		{
			if(s1.compareTo(s2)==0)
				System.out.println("String is palindrome");
			else
			System.out.println("String is not palindrome");
		}
		else
		{
			System.out.println("String is not palindrome");
		}
		
	}
	
	static void lTrim(String s)
	{
		byte b[] =s.getBytes();
		String a="";
		int count=0,len=0;
		for(byte i=0 ;i<s.length();i++)
		{
			if(b[i]==32 && (b[i+1]!=32)  && (i < (s.length()-1) ) )
			{
				count++;
				break;
			}
			else
				count++;
		}
		System.out.println("count" + count);
		for(int j=count;j<s.length();j++)
		{
			a +=s.charAt(j);
		}
		
		System.out.println("String after left Trim String is :"+a);
		a=a+"****";
		System.out.println("verify only left trim ::"+a);
	}
	
	
	static void rTrim(String s)
	{
		byte b[] =s.getBytes();
		String a="";
		int count=0;
		
		
		for(byte i= (byte)(s.length()-1) ;i>=0;i--)
		{
			if(b[i]==32 && (b[i-1]!=32)  )
			{
				count++;
				break;
			}
			else
				count++;
		}
		for(int j=0;j<s.length()-count;j++)
		{
			a +=s.charAt(j);
		}
		
		System.out.println("String after right Trim String is :"+a);
		a=a+"****";
		System.out.println("verify only right trim ::"+a);
	}
	
	static void allTrim(String s)
	{
		byte b[] =s.getBytes();
		String a="";
		int count1=0,count2=0;
		
		for(byte i=0 ;i<s.length();i++)
		{
			if(b[i]==32 && (b[i+1]!=32)  && (i < (s.length()-1) ) )
			{
				count1++;
				break;
			}
			else
				count1++;
		}
		
		for(byte i= (byte)(s.length()-1) ;i>=0;i--)
		{
			if(b[i]==32 && (b[i-1]!=32)  )
			{
				count2++;
				break;
			}
			else
				count2++;
		}
	
		for(int j=count1;j<s.length()-count2;j++)
		{
			a +=s.charAt(j);
		}
		
		System.out.println("String after all Trim String is :"+a);
		a=a+"****";
		System.out.println("verify only all trim ::"+a);
	}
	
	static void squeeze(String s)
	{
		byte b[] =s.getBytes();
		String a="";
		int count=0;
		
		for(byte i=0 ;i<s.length();i++)
		{
			if(b[i]!=32)
			{
				a=a+s.charAt(i);
			}
		}
		System.out.println("String after removing all spaces:"+a);
		
	}
	
	static void vowelCount(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if((s.charAt(i)=='a') || (s.charAt(i)=='e') || (s.charAt(i)=='i') || (s.charAt(i)=='o') || (s.charAt(i)=='u') ||
			(s.charAt(i)=='A') || (s.charAt(i)=='E') || (s.charAt(i)=='I') || (s.charAt(i)=='O') || (s.charAt(i)=='U')
			)
			{
				count++;
			}
		}
		System.out.println("Vowel in the String is::"+count);
	}
	
	public static void main(String ...a)
	{
		String s = "Ankit Chaurasia";
		System.out.println("String "+s);
		System.out.println();
		wordCount(s);
		
		spaceCount(s);
		
		charCount(s);
		
		reverseString(s);
		
		palindrome();
		
		lTrim("   An kit   ");
		
		rTrim("   An kit   ");
		
		allTrim("   An kit   ");
		
		squeeze("   An kit   "); //remove all apaces
		
		vowelCount(s);
		
		System.out.println();
	}
	
}