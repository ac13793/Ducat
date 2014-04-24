/*
<applet code="TestApplet1.class" height=600 width= 600>
		</applet>
*/

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class TestApplet1 extends Applet
{
	String s;
	
	public TestApplet1()
	{
		s="constructor";
	}
	
	public void init()
	{
		s=s+"\ninit";
	}
	
	public static void main(String ...s)
	{
		System.out.println("\nmain");
	}
	
	public void start()
	{
		setBackground(Color.YELLOW);
		s=s+"\nstart";
		display();
	}
	
	public void paint(Graphics g)
	{
		s=s+"\npaint";
		g.drawString(s,30,30);
	}
	
	void display()
	{
		s=s+"\ndisplay";
	}
	
	
}