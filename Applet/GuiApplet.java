import java.awt.*;
import java.awt.event.*;
import java.applet.*;

public class GuiApplet extends Applet implements ActionListener
{
	TextField tf;
	Button b;
	
	public void init()
	{
		tf=new TextField(30);
		b=new Button("ok");
		add(tf);
		add(b);
		setBackground(Color.YELLOW);
		b.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		tf.setText("Hello");
		My m=new My();
		m.setVisible(true);
	}
}

/*
<applet code="GuiApplet" height=600 width=600>
</applet>
*/