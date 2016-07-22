package arrayprogram;

import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		int temp = 0;
		int[] arr = {7,14,65,99,92,24};
		
		int l = arr.length;
		for(int i=0;i<l;i++){
		   for(int j=i+1;j< l;j++){
			   if(arr[i]>arr[j]){
				 temp = arr[i];
				 arr[i] = arr[j];
				 arr[j]= temp;
			   }
		   }
				
			}
		System.out.print(" Sorted array : ");
		for(int i = 0 ; i< l ; i++)
		System.out.print("  " +arr[i]);
		}
		
	
}


