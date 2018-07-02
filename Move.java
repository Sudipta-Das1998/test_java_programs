import java.awt.*;
import java.applet.Applet;
public class Move extends Applet implements Runnable
{
 Thread t;
 int x;
public void init()
{ 
setBackground(Color.cyan);
}
public void start()
{
 t=new Thread(this);
 t.start();
}
public void stop()
{
 t.stop();
 t=null;
}
public void run()
{
 while(true)
{
 for(x=1;x<=getSize().width;x+=20)
{ 
 repaint();
 try{
     Thread.sleep(500);
    }
catch(InterruptedException ie)
{
}
}
}
}
public void paint(Graphics g)
{
 g.setColor(Color.red);
 g.fillOval(x,200,50,50);
}
}
/*<applet code="Move" width=500 height=500>
</applet>*/

