import java.awt.*;
import java .applet.Applet;
public class Demo1 extends Applet
{
 Checkbox cb1,cb2,cb3,cb4;
 CheckboxGroup cbg;
 Choice ch;
 Button b;
 Font f;
 public void init()
  {
    b=new Button("Submit");
    f=new Font("Arial",Font.BOLD,22);
    b.setFont(f);
    ch=new Choice();
    ch.addItem(".Net");
    ch.add("Oracle");
    ch.insert("Java",0);
    ch.addItem("MY SQL");
    ch.setFont(f);
    cb1=new Checkbox("Oracle");
    cb1.setFont(f);
    cb2=new Checkbox("Java",true);
    cb2.setFont(f);
    cbg=new CheckboxGroup();
    cb3=new Checkbox("Male",cbg,true);
    cb4=new Checkbox("Female",cbg,false);
    cb4.setFont(f);
    add(ch);
    add(cb1);
    add(cb2);
    add(cb3);
    add(cb4);
    add(b);
  }
}
/*<applet code="Demo1" width=400 height=300>
</applet>*/