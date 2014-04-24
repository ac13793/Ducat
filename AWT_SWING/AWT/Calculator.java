import java.awt.*;
import java.awt.event.*;

class Calculator implements ActionListener
{
	Frame f;
	TextField tf;
	Button b[] = new Button[17];
	int count=0,dotButton=0,plusButton=0 , subButton=0 , mulButton=0 , divButton=0,equalButton=0;
	double n1,n2,n3;
	String num="",operator="";
	Calculator(String s)
	{
		f=new Frame(s);
		tf=new TextField();
		tf.setBounds(40,50,200,30);
		f.add(tf);
		for(int i=0;i<b.length;i++)
		{
			b[i]=new Button((i+1+""));
			if(i<4)
			{
				b[i].setBounds(40+(i*50),160,40,40);
			}
			if(i>=4&&i<8)
			{
				b[i].setBounds(40+((i-4)*50),220,40,40);
			}
			if(i>=8&&i<12)
			{	
				b[i].setBounds(40+((i-8)*50),280,40,40);
			}
			if(i>=12&&i<16)
			{
				b[i].setBounds(40+((i-12)*50),340,40,40);
			}
			
			b[i].addActionListener(this);
			f.add(b[i]);
		}
		b[16].setBounds(40,100,40,40);
		b[0].setLabel("7");
		b[1].setLabel("8");
		b[2].setLabel("9");
		b[3].setLabel("/");
		b[4].setLabel("4");
		b[5].setLabel("5");
		b[6].setLabel("6");
		b[7].setLabel("*");
		b[8].setLabel("1");
		b[9].setLabel("2");
		b[10].setLabel("3");
		b[11].setLabel("-");
		b[12].setLabel("0");
		b[13].setLabel(".");
		b[14].setLabel("=");
		b[15].setLabel("+");
		b[16].setLabel("c");
		
		
		f.setLayout(null);
		f.setSize(600,1000);
		f.setVisible(true);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==b[0])
		{
				num +=7;
				tf.setText(num);
		}
		
		if(e.getSource()==b[1])
		{
			num +=8;
			tf.setText(num);
		}
		
		if(e.getSource()==b[2])
		{
				num +=9;
				tf.setText(num);
		}
		
		if((e.getSource()==b[3]) && divButton==0)	//  '/'
		{
			if(num.contains("."))
				n1=Double.parseDouble(num);
			else
				n1=Integer.parseInt(num);
			num="";
			operator="/";
			tf.setText("");
			plusButton=1;
			subButton=1;
			mulButton=1;
			divButton=1;
			equalButton=1;
			dotButton=0;
		}
		
		if(e.getSource()==b[4])
		{
				num +=4;
				tf.setText(num);
		}
		
		if(e.getSource()==b[5])
		{
				num +=5;
				tf.setText(num);
		}
		
		if(e.getSource()==b[6])
		{
				num +=6;
				tf.setText(num);
		}
		
		if((e.getSource()==b[7])&&mulButton==0)	// *
		{
			if(num.contains("."))
				n1=Double.parseDouble(num);
			else
				n1=Integer.parseInt(num);
			num="";
			operator="*";
			tf.setText("");	
			plusButton=1;
			subButton=1;
			mulButton=1;
			divButton=1;
			equalButton=1;
			dotButton=0;
		}
		
		if(e.getSource()==b[8])
		{
				num +=1;
				tf.setText(num);
		}
		
		if(e.getSource()==b[9])
		{
				num +=2;
				tf.setText(num);
		}
		
		if(e.getSource()==b[10])
		{
				num +=3;
				tf.setText(num);
		}
		
		if((e.getSource()==b[11])&& subButton==0)	// -
		{
			if(num.contains("."))
				n1=Double.parseDouble(num);
			else
				n1=Integer.parseInt(num);
			num="";
			operator="-";
			tf.setText("");
			plusButton=1;
			subButton=1;
			mulButton=1;
			divButton=1;
			equalButton=1;
			dotButton=0;
			
		}
		
		if(e.getSource()==b[12])
		{
				num +=0;
				tf.setText(num);
		}
		
		if((e.getSource()==b[13]) && dotButton==0)
		{
			num +='.';
			tf.setText(num);	
			dotButton=1;
			equalButton=1;
		}
		
		
		if((e.getSource()==b[14])&&equalButton==1)	// '='
		{
			equalButton=0;
			//tf.setText(num+"Ankit"+n1);
			if(num.contains("."))
			{
				n2=Double.parseDouble(num);
			}
			else
			{
				n2=Integer.parseInt(num);
			}
			if(operator.equals("+"))
			{
				n3=n1+n2;
				tf.setText(String.valueOf(n3));
				num="";
				operator="";
				dotButton=0;
				plusButton=0;
				subButton=0;
				mulButton=0;
				divButton=0;
			}
			
			if(operator.equals("-"))
			{
				n3=n1-n2;
				tf.setText(String.valueOf(n3));
				num="";
				operator="";
				dotButton=0;
				plusButton=0;
				subButton=0;
				mulButton=0;
				divButton=0;

			}
			
			if(operator.equals("*"))
			{
				n3=n1*n2;
				tf.setText(String.valueOf(n3));
				num="";
				operator="";
				dotButton=0;
				plusButton=0;
				subButton=0;
				mulButton=0;
				divButton=0;
			}
			
			if(operator.equals("/"))
			{
				n3=n1/n2;
				tf.setText(String.valueOf(n3));
				num="";
				operator="";
				dotButton=0;
				plusButton=0;
				subButton=0;
				mulButton=0;
				divButton=0;
			}
			
		}
		
		if((e.getSource()==b[15])&& plusButton==0)  // +
		{
			if(num.contains("."))
				n1=Double.parseDouble(num);
			else
				n1=Integer.parseInt(num);
			
			num="";
			operator="+";
			tf.setText("");
			plusButton=1;
			subButton=1;
			mulButton=1;
			divButton=1;
			equalButton=1;
			dotButton=0;
			
		}
		
		if(e.getSource()==b[16])
		{
				tf.setText("");
				num="";
				count=0;
				dotButton=0;
				plusButton=0;
				subButton=0;
				mulButton=0;
				divButton=0;
				equalButton=0;
		}
		
	}
	
	public static void main(String ...s)
	{
		new Calculator("Calculator");
	}
}