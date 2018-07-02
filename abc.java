import java.applet.*;
import java.awt.*;
/*<applet code="abc" width=400 height=500>
<param name="param1" value ="6">
</applet>
*/
public class abc extends Applet
{
   public int n;
public void init()
{
 n=Integer.parseInt(getParameter("param1"));
 
}


public void paint(Graphics g)
{
  int s=0;
  for(int i=0;i<n;i++)
  {
   if(n%i==0)
   {
     s=s+i;
   }
  }
Font ff=new Font("Arial",Font.BOLD,22);
g.setFont(g);
if(n==s)
  g.drawString("Perfect",50,30);
else
  g.drawString("Not Perfect",50,30);
}
}
