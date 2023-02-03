package com.velocity.practice;

public class MaxMin2 {
      
	public static void main(String[] args) {
		
		int arr[]= {5,3,22,45,21,8,11};
		int arrlength = arr.length;
		int max=arr[0];
		int min=arr[0];

		for(int i=arrlength-1;i>=0;i--) {
		
			if(arr[0]<arr[i]) {
				max=arr[i];
				
			}			
		  
		}
		System.out.println("Maximum Elemet in array is :: "+max);
		 
		
		 for(int i=arrlength-1;i>=0;i--) {
			
			if(arr[0]>arr[i]) {
				min=arr[i];
				 
			}			
		   
		}
		 System.out.println("minimum Elemet in array is :: "+min);
		
	 }

}
