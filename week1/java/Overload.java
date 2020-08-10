package javaprogram;


public class Overload {
	
	public void disp(char c)
    {
         System.out.println(c);
    }
    public void disp(char c, int num) {  
    
         System.out.println(c + " "+num);
    }
}
class Sample
{
   public static void main(String args[])
   {
     Overload obj = new Overload();
       obj.disp('a');
       obj.disp('a',10);
   }



}
