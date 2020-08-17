package Inheritance_Of_Single;

 public class Main
{
   public void methodA()
   {
     System.out.println("Base class method");
   }
}
class Single extends Main
{
   public void methodB()
   {
     System.out.println("Child class method");
   }
   public static void main(String args[])
   {
	   Single obj = new Single();
     obj.methodA(); //calling super class method
     obj.methodB(); //calling local method
  }
}