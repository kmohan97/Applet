import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class Demo3 extends Applet
	Image mi;
	int x=60,y=70;
	public void init()
	{
	addMouseMotionListener(this);
	mi=getImage(getCodeBase(),"apple.jpg");
	//repaint();
	}
	
	public void addMouseMotionListener(new MouseMotionAdapter()
	{
	public void mouseDragged(MouseEvent me)
	{
	x=me.getX();
	y=me.getY();
	repaint();
	});
	public void paint(Graphics g)
	{
	Font f=new Font("arial",Font.ITALIC,33);
	g.drawString("Drag it",x,y);
	g.drawImage(mi,x,y,this);
	}
}
/*<applet code="Demo3" width=1000 height=1000>
</applet>*/	
