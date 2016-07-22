package looping;

import java.util.Scanner;

public class fibnocal {
	public static void main(String args[]){
		System.out.println("Enter the number for Fibnocci series to print :" );
		 Scanner scanner = new Scanner(System.in);
		 int number = scanner.nextInt();
		 System.out.println("Fibonacci series upto " + number +" number is  : "); 
		 //printing Fibonacci series upto number 
		 Fibano(number);
		 
		 
		 }
	public static void Fibano(int number){
		if (number == 0){
			System.out.println("0");
		}else if(number == 1){
			System.out.println("0 1 ");
		}else {
			System.out.print(" 0 1 ");
			int a=0;
			int b=1;
			for(int i=1;i<number;i++){
				int nextnumber = a+b;
				System.out.print(nextnumber + " ");
				a=b;
				b=nextnumber;
			}
			
		}
			
		
	}
	
	
	
	
	

	}

	
