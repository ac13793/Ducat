import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SFrame implements ActionListener
{
	JFrame jf;
	JButton jb;
	Button b;
	JTextField jt;
	//Icon i;
	SFrame(String s)
	{
		//i=new ImageIcon("puccy.gif");
		jf=new JFrame(s);
		jb=new JButton("JBUTTON");
		b=new Button("AWT Button");
		jt=new JTextField();
		
		jt.setBounds(150,40,100,100);
		b.setBounds(40,40,100,100);
		jb.setBounds(40,150,50,50);
		
		Container c=jf.getContentPane();
		c.add(jt);
		c.add(jb);
		c.add(b);
		
		/*
		jf.add(b);
		jf.add(jb);
		jf.add(jt);
		*/
		b.addActionListener(this);
			//jf.setLayout(null);	//WindowConstants
		c.setLayout(null);
		//jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		//jf.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		//jf.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		jf.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
		
		jf.setSize(600,600);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		jt.setText("Swing");
	}
	
	public static void main(String ...a)
	{
		new SFrame("Swing Frame");
		new SFrame("Swing Frame");
	}
	
	
}