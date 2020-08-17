package Inheritance_Of_Hierarchical;

 public class A
{
   public void methodA()
   {
      System.out.println("Computer University");
   }
}
class B extends A
{
   public void methodB()
   {
      System.out.println("Computer Science");
   }
}
class C extends A
{
  public void methodC()
  {
     System.out.println("Computer Technology");
  }
}
class D extends A
{
  public void methodD()
  {
     System.out.println("Teachers");
  }
}
class JavaExample
{
  public static void main(String args[])
  {
     B obj1 = new B();
     C obj2 = new C();
     D obj3 = new D();
     //All classes can access the method of class A
     obj1.methodA();
     obj1.methodB();
     obj2.methodC();
     obj3.methodD();
  }
}

