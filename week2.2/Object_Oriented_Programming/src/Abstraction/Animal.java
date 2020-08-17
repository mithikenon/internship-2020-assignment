package Abstraction;

//Abstract class
abstract class Animal {

public abstract void animalSound();    // Abstract method (does not have a body)

public void sleep()        // Regular method
{
 System.out.println("Zzz");
}
}


class Pig extends Animal {   //Subclass (inherit from Animal)
	
public void animalSound() {   // The body of animalSound() is provided here
 
 System.out.println("The pig says: wee wee"); 
}
}

class MyMainClass {
	
public static void main(String[] args) {
	
 Pig myPig = new Pig(); // Create a Pig object
 
 myPig.animalSound();
 
 myPig.sleep();
}
}

