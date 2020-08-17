package AccessModifier_protected;

public class Person {
	  protected String fname = "Mi Thike";
	  protected String lname = "Non";
	  protected String email = "mithikenon@gmail.com";
	  protected int age = 21;
	  
	}

	class Student extends Person {
		protected int graduationYear = 2020;
	  public static void main(String[] args) {
	    Student myObj = new Student();
	    System.out.println("Name: " + myObj.fname + " " + myObj.lname);
	    System.out.println("Email: " + myObj.email);
	    System.out.println("Age: " + myObj.age);
	    System.out.println("Graduation Year: " + myObj.graduationYear);
	  }
	}