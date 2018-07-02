import java.awt.*;
public class M extends Frame
{
GridLayout g; 
Menu m,sub;
MenuBar bar;
MenuItem item1,item2,item3,item4,item5;
CheckboxMenuItem cb;
public M(String title)
{
 super(title);
 g=new GridLayout(1,1);
 setLayout(g);
 bar=new MenuBar();
 setMenuBar(bar);
 m=new Menu("File");
 sub=new Menu("Edit");
 item1=new MenuItem("new");
 item2=new MenuItem("print");
item3=new MenuItem("save");
item4=new MenuItem("copy");
item5=new MenuItem("cut");
cb=new CheckboxMenuItem("ok");
 m.add(item1);
 m.addSeparator();
 m.add(item2);
 m.add(item3);
 sub.add(item4);
 sub.addSeparator();
 sub.add(item5);
 sub.add(cb);
 bar.add(m);
 bar.add(sub);
 setSize(300,400);
 setVisible(true);
}
public static void main(String args[])
{
 M ob=new M("Menu Components");
}

} 