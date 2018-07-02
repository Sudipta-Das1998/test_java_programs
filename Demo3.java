import java.awt.*;
import java.applet.Applet;
public class Demo3 extends Applet
{
 ScrollPane sp;
 Button b;
 List l;
 Label ll1,ll2;
 TextField tf1,tf2;
 TextArea ta;
 Font f,ff;
 public void init()
 {
   sp=new ScrollPane();
   b=new Button("Java Technocrat");
   ff=new Font("Arial",Font.BOLD,100);
   b.setFont(ff);
   sp.add(b);
   l=new List(3,true);
   f=new Font("Arial",Font.BOLD,20);
   l.addItem("Oracle");
   l.addItem("Java");
   l.addItem(".Net");
   l.addItem("Python");
   l.setFont(f);
   
   ta=new TextArea(10,20);
   ta.setText("I am in java Technocrat");
   ta.setFont(f);
   ta.setEditable(false);
   ll1=new Label("Enter user Name");
   ll1.setFont(f);
   ll2=new Label("Enter password");
   ll2.setFont(f);
   tf1=new TextField(12);
   tf1.setFont(f);
   tf2=new TextField(12);
   tf2.setEchoChar('*');
   tf2.setFont(f);

   add(ll1);
   add(tf1);
   add(ll2);
   add(tf2);
   add(sp);
   add(ta);
   add(l);
}
}
/*<applet code="Demo3" width=500 height=400>
</applet>*/

                