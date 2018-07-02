import java.applet.Applet;
import java.awt.*;
public class Face extends Applet
{
  public void init()
  {
   setBackground(Color.black);
  }
public void paint(Graphics g)
{
  g.setColor(Color.yellow);
  g.fillOval(60,60,200,200);
  g.setColor(Color.black);
  g.fillOval(90,120,50,22);
  g.fillOval(190,120,50,22);
  g.drawLine(165,125,165,175);
  g.drawLine(165,175,150,160);
  g.drawArc(112,185,99,90,0,180);
}
}
/*<applet code="Face" width=400 height=400>
</applet>*/