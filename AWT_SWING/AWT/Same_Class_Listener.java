//Three_Listener.java
import java.awt.*;
import java.awt.event.*;

class Three_Listener implements ActionListener
{
	Frame f;
	Button b1,b2;
	TextField tf;
	
	Three_Listener(String s)
	{
		f=new Frame(s);
		
		b1=new Button("OK");
		b2=new Button("Cancel");
		b1.setBounds(20,100,40,40);
		b2.setBounds(20,180,40,40);
		b1.addActionListener(this);
		b2.addActionListener(this);
		f.add(b1);
		f.add(b2);
		
		tf=new TextField();
		tf.setBounds(20,40,100,40);
		f.add(tf);
		
		f.setLayout(null);
		f.setSize(600,600);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b1)
		{
			tf.setText("OK");
		}
		if(e.getSource()==b2)
		{
			tf.setText("Cancel");
		}
	}
	
	public static void main(String ...a)
	{
		new Three_Listener("Same Class Listener");
	}
}