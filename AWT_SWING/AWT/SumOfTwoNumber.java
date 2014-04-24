//SumOfTwoNumber

import java.awt.*;
import java.awt.event.*;
class SumOfTwoNumber implements ActionListener
{
	Frame f;
	Button b;
	TextField tf1,tf2,tf3;
	
	SumOfTwoNumber()
	{
		f=new Frame();
		b=new Button("Sum");
		b.addActionListener(this);
		f.add(b);
		
		tf1=new TextField();
		tf2=new TextField();
		tf3=new TextField();
		f.add(tf1);
		f.add(tf2);
		f.add(tf3);
		
		f.setLayout(new FlowLayout());
		f.setSize(600,600);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=tf1.getText();
		String s2=tf2.getText();
		int n1=Integer.parseInt(s1);
		int n2=Integer.parseInt(s2);
		int n3=n1+n2;
		tf3.setText(String.valueOf(n3));
	}
	
	public static void  main(String ...s)
	{
		new SumOfTwoNumber();
	}
	
}