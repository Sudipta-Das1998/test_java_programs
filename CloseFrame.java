import java.awt.*;
import java.applet.Applet;
import java.awt.event.*;
public class CloseFrame extends Frame
{
 public CloseFrame(String title)
{
 super(title);
 addWindowListener(new WindowAdapter()
                  {
                    public void windowClosing(WindowEvent we)
                     {
                        System.exit(0);
                     }
                  });
}
public static void main(String args[])
{
  CloseFrame c=new CloseFrame("Closing A Frame");
}
}   