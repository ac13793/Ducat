import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class SFrame1 implements ActionListener
{
	JFrame jf;
	JButton jb;
	Button b;
	JTextField jt;
	//Icon i;
	SFrame1(String s)
	{
		//i=new ImageIcon("puccy.gif");
		jf=new JFrame(s);
		jb=new JButton("JBUTTON");
		b=new Button("AWT Button");
		jt=new JTextField();
		
		jt.setBounds(150,40,100,100);
		b.setBounds(40,40,100,100);
		jb.setBounds(40,150,50,50);
		
		jf.add(b);
		jf.add(jb);
		jf.add(jt);
		
		b.addActionListener(this);
		jf.setLayout(null);	//WindowConstants
		
		jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		jf.setSize(600,600);
		jf.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		jt.setText("hello");
	}
	
	public static void main(String ...a)
	{
		new SFrame1("Swing Frame");
	}
	
	
}