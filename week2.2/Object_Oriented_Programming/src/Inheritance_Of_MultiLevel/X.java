package Inheritance_Of_MultiLevel;

 public class X
{
   public void methodX()
   {
     System.out.println("Hello All Guys");
   }
}
class Y extends X
{
public void methodY()
{
System.out.println("Hello All Friends");
}
}
class Z extends Y
{
   public void methodZ()
   {
     System.out.println("Hello All Team members");
   }
   public static void main(String args[])
   {
     Z obj = new Z();
     obj.methodX(); //calling grand parent class method
     obj.methodY(); //calling parent class method
     obj.methodZ(); //calling local method
  }
}
