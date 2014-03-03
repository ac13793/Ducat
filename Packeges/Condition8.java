/*
setting the classpath dynamically
 */

class Condition8
{
 public static void main(String ...s)
 {
	String cp=System.getProperty("java.class.path"); 
	System.out.println(cp);
	System.setProperty("java.class.path","E:\\Programming\\JAVA\\DUCAT\\Packeges");
	String cp1=System.getProperty("java.class.path");
	System.out.println(cp1);
 }
}