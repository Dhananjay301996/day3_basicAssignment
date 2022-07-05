package day3basic_Assignment;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int [] arr = new int [] {32,12,54,77,89}; 
		 
		 int max = arr[0];
		 
		  for (int i = 0; i < arr.length; i++) {  
	            
	           if(arr[i] > max)  
	               max = arr[i];  
	        }  
	        System.out.println("Largest element present in given array: " + max);
	}

}
