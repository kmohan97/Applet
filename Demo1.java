import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Demo1 extends Applet implements ActionListener 
{	
	Button b1,b2;
	Label tf1,tf2,tf3;
	Panel p1,p2,p3,p;
	CardLayout c;
	Font f;
	public void init()
	{
	p=new Panel();
	c=new CardLayout();
	p.setLayout(c);
	
	b1=new Button("Next");
	b2=new Button("Prev");
	
	p1=new Panel();
	tf1=new Label("This is Java");	
	tf1.setFont(f);
	tf1.setBackground(Color.pink);
	tf1.setForeground(Color.blue);
	p1.add(tf1);
	
	p2=new Panel();
	tf2=new Label("This is C");	
	tf2.setFont(f);
	tf2.setBackground(Color.black);
	tf2.setForeground(Color.white);
	p2.add(tf2);
	
	p3=new Panel();
	tf3=new Label("This is C++");	
	tf3.setFont(f);
	tf3.setBackground(Color.black);
	tf3.setForeground(Color.yellow);
	p3.add(tf3);
	
	b1.addActionListener(this);
	b2.addActionListener(this);

	
	p.add(p1,"sdvsv");
	p.add(p2,"dvds");
	p.add(p3,"sdsdvdegsfa");
	
	add(b1);
	add(b2);
	add(p);
	}
	public void actionPerformed(ActionEvent ae)
	{
	if(ae.getSource()==b1)
	{
	c.next(p);
	}
	else{
	//c.prev(p);
	}
	}
}
/*<applet code="Demo1" height=500 width=500>
</applet>*/