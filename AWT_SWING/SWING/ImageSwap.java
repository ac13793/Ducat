import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class MyCanvas extends Canvas
{
	Image i,i2;
	MyCanvas(Image i,Image i2)
	{
		this.i=i;
		this.i2=i2;
	
	}
	public void paint(Graphics g)
	{
		g.drawImage(i,100,300,100,100,this);
		g.drawImage(i2,400,300,100,100,this);
	}

} 

class ImageSwap extends Frame implements ActionListener
{
	JButton b1,b2;
	Image i,i2;
	MyCanvas m;	
	ImageSwap()
	{
		super("graphics");
		
		Toolkit t=Toolkit.getDefaultToolkit();
		i=t.getImage("E:\\PROGRAMMING\\JAVA\\DUCAT\\AWT_SWING\\SWING\\image1.gif");
		i2=t.getImage("E:\\PROGRAMMING\\JAVA\\DUCAT\\AWT_SWING\\SWING\\image2.jpg");
		
		
		 m=new MyCanvas(i,i2);
		b1=new JButton("swap");
		b1.setBounds(40,40,100,100);
		
		b2=new JButton("As it is!");
		b2.setBounds(400,40,100,100);
		
		add(b1);
		add(b2);
		add(m);
		setSize(600,600);
		//setBackground(Color.red);
		b1.addActionListener(this);
		b2.addActionListener(this);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			m.i=i2;
			m.i2=i;
		}
		if(e.getSource()==b2)
		{
			m.i=i;
			m.i2=i2;
		}
		
		
	}
		

	public static void main(String s[])
	{
	new ImageSwap();
	}
}

