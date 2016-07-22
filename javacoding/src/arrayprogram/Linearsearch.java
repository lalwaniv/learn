package arrayprogram;

import java.util.Scanner;

public class Linearsearch {
	public static void main(String[] args) {
	
		int[] arr1 = {7,14,65,99,9,24};
		Scanner num = new Scanner(System.in);
		System.out.println("Enter a number to do the Linear search :  ");
		int n = num.nextInt();
		
		for(int i=0;i<arr1.length;i++){
			
				if(arr1[i]==n){
					System.out.println(" The number does Exist in the array .");
					break;
				}else if (i == arr1.length-1)
					System.out.println(" Number does not exist ");
				
			}
		}
		
	
}


