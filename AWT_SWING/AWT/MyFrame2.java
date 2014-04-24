import java.awt.*;

class MyFrame2 
{
	Frame f;
	MyFrame2(String s)
	{
		f=new Frame(s);
		
		f.setSize(400,400);
		f.setVisible(true);
	}
	public static void main(String ...s)
	{
		new MyFrame2("Ankit");
	}
}