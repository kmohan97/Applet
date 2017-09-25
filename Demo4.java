import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Demo4 extends Applet implements KeyListener
{
	int k,x=100,y=100,width,height;

	public void init()
	{
		//setBackground(Color.black);
		addKeyListener(this);
	}
	public void paint(Graphics g)
	{
	g.setColor(Color.red);
	g.fillOval(x,y,30,30);
	}
	public void keyPressed(KeyEvent ke)
	{
	width=getSize().width;
	height=getSize().height;
	k=ke.getKeyCode();
	if(k==KeyEvent.VK_LEFT)
	{
	x-=20;
	if(x<0)
	x=width-20;
	repaint();
	}
	else if(k==KeyEvent.VK_RIGHT)
	{
	x+=20;
	if(x>width)
	x=0;
	repaint();
	}
	else if(k==KeyEvent.VK_DOWN)
	{
	y+=20;
	if(y>height)
	y=0;
	repaint();
	}
	else if(k==KeyEvent.VK_UP)
	{
	y-=20;
	if(y<0)
	y=height-20;
	repaint();
	}
	}
	public void keyReleased(KeyEvent ke)
	{
	}
	public void keyTyped(KeyEvent ke)
	{
	}
	
}

/*<applet code="Demo4" width=500 height=500>
</applet>*/