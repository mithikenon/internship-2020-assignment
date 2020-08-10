package javaprogram;

public class program4 {
	
	public static void main(String[] args) {
		
		superMethod();
		program4 myApk=new program4();
		myApk.hyperMethod();
		ultraMethod();
		

	}
	
	public static void superMethod() {
		System.out.println("This is super Methods........");
		return;
		
	}
	
	public void hyperMethod() {
		System.out.println("This is hyper Methods.......");
	}
	
	public static int ultraMethod() {
		System.out.println("This is ultra Methods........");
		return 234;
	}

}
