//Three_Listener.java
import java.awt.*;
import java.awt.event.*;

class Three_Listener implements ActionListener	//it is a Same Class Listener
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
		Outer_Class_Listener o=new Outer_Class_Listener(this);
		b1.addActionListener(this);	//Source ke pass jiska reference hoga usi ka method clega
		//b2.addActionListener(this);	
		//b2.addActionListener(o);
		b2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				tf.setText("Inner ok");
			}
		});
		
		f.add(b1);
		f.add(b2);
		
		tf=new TextField();
		tf.setBounds(20,40,100,40);
		tf.addKeyListener(new KeyEventListener());
		f.add(tf);
		
		f.addWindowListener(new WindowEventListener());
		f.addMouseListener(new MouseEventListener(this));
		
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

//------------------Outer Class Listener-----------------------

class Outer_Class_Listener implements ActionListener
{
	Three_Listener t;
	
	Outer_Class_Listener(Three_Listener t)
	{
		this.t=t;
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==t.b1)
		{
			t.tf.setText("Outer OK");
		}
		if(e.getSource()==t.b2)
		{
			t.tf.setText(" Outer Cancel");
		}
	}
	
}


class WindowEventListener extends WindowAdapter
{
	public void windowClosing(WindowEvent e1)
	{
		System.exit(0);
	}
}

class MouseEventListener extends MouseAdapter
{
	Three_Listener t;
	MouseEventListener(Three_Listener t)
	{
		this.t=t;
	}
	
	public void mouseClicked(MouseEvent me)
	{
		t.tf.setText("mouse event");
		t.f.setBackground(Color.RED);
	}
}

class KeyEventListener extends KeyAdapter
{
	public void keyTyped(KeyEvent k)
	{
		System.out.println(k.getKeyChar());
	}
}