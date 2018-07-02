import java .awt.*;
import java.applet.Applet;
class CanvasDemo extends Canvas
  {
    CanvasDemo()
      {
          setSize(400,400);
          setVisible(true);
          setBackground(Color.yellow);
      }
  public void paint(Graphics g)
   {
     g.setColor(Color.red);
     g.drawLine(50,70,290,300);
     g.setColor(Color.blue);
     g.drawRoundRect(70,50,170,100,10,12);
     g.setColor(Color.red);
     g.fillOval(120,180,100,100);
  }
}
public class Demo2 extends Applet
{
 CanvasDemo cd;
 public  void init()
 {
      cd=new CanvasDemo();
      add (cd);
 }
}
/*<applet code="Demo2" width=500 height=450>
</applet>*/

