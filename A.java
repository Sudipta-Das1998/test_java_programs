import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class A extends Applet implements ActionListener
{
 Button b1,b2;
 Font ff;
 public void init()
{
 ff=new Font("Arial",Font.BOLD,22);
 b1=new Button("Red");
 b2=new Button("Blue");
 b1.setFont(ff);
 b2.setFont(ff);
 b1.addActionListener(this);
 b2.addActionListener(this);
 add(b1);
add(b2);
}
 public void actionPerformed(ActionEvent ae)
 {
  Button bb=(Button)ae.getSource();
 if(bb==b1)
{
 setBackground(Color.red);
}
else
{ 
setBackground(Color.blue);
}
}}
/*<applet code="A" width=300 height=300>
</applet>*/