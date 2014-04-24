// Design a Calculator in 15 lines
import java.awt.*;
class DesignCalculator{
	Frame f=new Frame("DesignCalculator");
	TextField tf;
	Button b[] = new Button[10];
	DesignCalculator(String s){
		tf=new TextField();
		tf.setBounds(40,40,200,30);
		f.add(tf);
		for(int i=0;i<b.length;i++){
			b[i]=new Button((i+1+""));
		b[i].setBounds(40+(i*40),160,40,40);
		f.add(b[i]);}
		f.setVisible(true);	}
	public static void main(String ...s){
		new DesignCalculator("DesignCalculator");}}