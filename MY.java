import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;
public class MA extends Applet implements ActionListener
{
 Font f;
 Button b1,b2,b3;
 public void init()
{
  b1=new Button("RED");
  b1=new Button("BLUE");
  b1=new Button("GREEN");
 f=new Font("Arial",Font.BOLD,22);
 b1.setFont(f);
 b2.setFont(f);
  b3.setFont(f);
 b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
add(b1);
add(b2);
add(b3);
}
public void actionPerformed(ActionEvent ae)
{
  Button aa=(Button)ae.getSource();
 if(aa==b1)
{
   setBackground(Color.red);
}
 else if(aa==b2)
{
 setBackground(Color.blue);
}

 else
{
 setBackground(Color.green);
}
 
 }}

/*<applet code="MY" width=300 height=400>
</applet>*/