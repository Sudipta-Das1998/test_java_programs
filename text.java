import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class text extends Applet implements TextListener
{
  TextArea ta1,ta2;
  Font f;
  public void init()
 {
  ta1=new TextArea(5,10);
  ta2=new TextArea(5,10);
  f=new Font("Arial",Font.BOLD+Font.ITALIC,16);
 ta1.addTextListener(this);
ta1.setFont(f);
ta2.setFont(f);
add(ta1);
add(ta2);
}
public void textValueChanged(TextEvent te)
{
 ta2.setText(ta1.getText());
}
}
/*<applet code="text" width=400 height=400>
</applet>*/
