package Encapsulation;

public class Example {
	
	 private String name;
	 private String idNum;
	 private int age;
	   
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdNum() {
		return idNum;
	}
	public void setIdNum(String idNum) {
		this.idNum = idNum;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

		   public static void main(String args[]) {
		      Example encap = new Example();
		      encap.setName("James");
		      encap.setAge(20);
		      encap.setIdNum("12343ms");

		      System.out.println("Name : " + encap.getName());
		      
		      System.out.print(" Age : " + encap.getAge());
		   }
		}

