package day3basic_Assignment;

public class program4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = new int [] {32,12,54,77,89}; 
		 
		 int min = arr[0];
		 
		  for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] < min)  
	               min = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + min);
	}


}
