package javaprogram;

public class pro5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numArray[]= {34,54,64,42,34,56,44,65,87,23,57,74};
		
		int n=numArray.length;
		
		int smallest=numArray[0];

		int biggest=numArray[0];
		
		 for(int i=0;i<n;i++) {
		if(numArray[i] > biggest) 
			
			biggest=numArray[i];
		
		else if(numArray[i] < smallest) {
			
			smallest=numArray[i];
			
			System.out.println("The biggestNumber are:"+biggest );
			
			   
			
		    System.out.println("The smallestNumber are:"+smallest );
		}
		}

	}

}
