import java.awt.*;
import java.awt.event.*;
import java.lang.String;
public class Demo2 extends Frame implements ActionListener
{
	Button b1,b2;
	Label l1,l2,l3;
	TextField tf1,tf2,tf3;
	FlowLayout fl;
	String s,s1;
	public Demo2()
	{
	fl=new FlowLayout();
	setLayout(fl);
	Font f=new Font("verdana",Font.BOLD,23);
	l1=new Label("Text in Upper Case");
	l2=new Label("Text in Lower Case");
	l3=new Label("Resultant text:-");
	l1.setFont(f);
	l2.setFont(f);
	l3.setFont(f);
	b1=new Button("For 1");
	b1.setFont(f);
	b2=new Button("For 2");
	b2.setFont(f);
	tf1=new TextField(20);
	tf2=new TextField(20);
	tf3=new TextField(20);
	tf1.setFont(f);
	tf2.setFont(f);
	tf3.setFont(f);
	b1.addActionListener(this);
	b2.addActionListener(this);
	add(l1);
	add(tf1);
	add(l2);
	add(tf2);
	add(l3);
	add(tf3);
	add(b1);
	add(b2);
	setVisible(true);
	setSize(500,500);
	}
	public void actionPerformed(ActionEvent ae)
	{
	Button bb=(Button)ae.getSource();
	if(bb==b1)
	{
	s=tf1.getText();
	tf3.setText(s.toLowerCase());
	}else{
	s1=tf2.getText();
	tf3.setText(s1.toUpperCase());
	}
	}
	public static void main(String as[])
	{
	Demo2 sd=new Demo2();
	}
}
		
	
	