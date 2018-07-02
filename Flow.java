import java.awt.*;
public class Flow extends Frame
{
 Font f;
FlowLayout f1;
Button b1,b2,b3,b4;
public Flow(String title)
{
 super(title);
 f1=new FlowLayout();
 setLayout(f1);
 b1=new Button("First");
 b2=new Button("Second");
 b3=new Button("Third");
 b4=new Button("Fourth");
 f=new Font("Arial",Font.BOLD+Font.ITALIC,22);
 b1.setFont(f);
 b2.setFont(f);
 b3.setFont(f);
 b4.setFont(f);
 add(b1);
 add(b2);
 add(b3);
 add(b4);
 setSize(300,400);
 setVisible(true);
}
public static void main(String args[])
{
 Flow ff=new Flow("Flow Layout");
}
}
