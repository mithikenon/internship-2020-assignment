package AccessModifier_public;

public class Person {
	public String fname = "Mi Thike";
	public String lname = "Non";
	public String email = "mithikenon@gmail.com";
	public int age = 21;
	  
	public static void main(String[] args) {
	    Person myObj = new Person(); 
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	  }
}
