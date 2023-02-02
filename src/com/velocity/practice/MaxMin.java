package com.velocity.practice;

public class MaxMin {
 
	public static void main(String[] args) {
		
		int arr[]= {5,3,22,45,21,8,11};
		int temp;
		int arrlength = arr.length;
		for(int i=0;i<arrlength;i++) {
		    for(int j=i+1 ;j<arrlength;j++) {
				if(arr[i]>=arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			 }
		}
		
		System.out.println("Shorted array");
		for(int i=0;i<arrlength;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	
		System.out.println("Maximum element :: "+arr[arrlength-1]);
		System.out.println("Miniimum element :: "+arr[0]);
	}
}

