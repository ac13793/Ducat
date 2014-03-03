class IVQ1{
	public static void main(String ...g)
	{
	  byte b=10;
	  byte c=20;
	  byte d=b+c;	//this will give compile time error 
	  //b+c =30 is a output in a form of literal , and in java default literal type is int 
	  //and int can not convert in byte
	  System.out.println(d);
	}
}