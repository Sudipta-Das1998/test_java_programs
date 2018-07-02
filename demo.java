public class Demo
{
 String name;
 public void setName(String name)
 {
  this.name=name;
  System.out.println(this); //this.toString
 }
 public String getName()
{ 
 return name;
}
 
public static void main(String args[])
{ 
  Demo dd=new Demo();
  dd.setName("Sudi");
  System.out.println("name is:"+ dd.getName());
 }
}

