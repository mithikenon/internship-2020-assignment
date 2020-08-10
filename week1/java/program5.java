package javaprogram;

public class program5 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] studentNames=new String[10];
		
	
		
	     studentNames[0]= "Nora";
		studentNames[1]="AyeAye";
		studentNames[2]="Non Non";
		studentNames[3]="Ko Ko";
		studentNames[4]="Thae Thae";
		studentNames[5]="Su Su";
		studentNames[6]="Mee Mee";
		studentNames[7]="Ei Ei";
		studentNames[8]="Ma Ma";
		studentNames[9]="May May";
		
		for(int i=0;i<=studentNames.length; i++) {
			
			System.out.print("<Your Name Here>");
			
			 System.out.print("I'm "+studentNames[i]);			 
			  
			 System.out.println(" and my Index is :"+i);
			  
		}
			

}
}