package looping;

import java.util.Scanner;

public class swapping {
	public static void main(String[] args) {
		Scanner number = new Scanner(System.in);
		System.out.println("Enter the value of first number  : ");
		int num1 = number.nextInt();
		System.out.println("Enter the value of second  number  : ");
		int num2 = number.nextInt();
		swapping swap = new swapping();
		
		swap.justswap(num1,num2);
		swap.varswap(num1, num2);
		
		
		
	}
	private int num1;
	public  void justswap (int x,int y){
		int num1 = x;
		int num2 = y;
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		System.out.println("The numbers after swapping are  :"+ num1+"    "+num2);
		
		
		
		
	}
	public void varswap(int num1, int num2){
		int x = num1;
		int y = num2;
		int z = x;
		x = y;
		y = z;
		System.out.println(" Numbers after swapping using variable are :"+ x+"    "+y);
		
	
	}

}
