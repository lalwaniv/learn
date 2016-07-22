package FileHandling;

import java.io.BufferedReader;
import java.io.Console;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class inputReaders {
	public static void main(String[] args) throws IOException {
		inputReaders ir = new inputReaders();
		ir.addition();
		try {
			ir.subtraction();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ir.multiply();
		//ir.division();
	}
	void addition(){
			Scanner numbers = new Scanner(System.in);
			System.out.println("Enter two numbers for addition :");
			int num1 = numbers.nextInt();
			int num2 = numbers.nextInt();
			System.out.println("sum : "+ (num1+num2)+ "\n");
		}
	void subtraction() throws IOException{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter first number for subtraction : ");
		String num1 = br.readLine();
		System.out.println("Enter second number: ");
		String num2 = br.readLine();
		System.out.println("Difference : " + (Integer.parseInt(num1)-Integer.parseInt(num2)));
		
	}
	void multiply() throws IOException{
		DataInputStream number = new DataInputStream(System.in);
		System.out.println("Enter first number for multiplication  : ");
		int num1 = Integer.parseInt(number.readLine());
		System.out.println("Enter second number :");
		int num2 = Integer.parseInt(number.readLine());
		System.out.println("Product : " + (num1*num2));
		 
			
	}
	void division(){
		System.out.println("Enter a number :");
		Console c = System.console();
		String s = c.readLine();
	    int num1 = Integer.parseInt(c.readLine());
	    System.out.println("Enter second number :");
	    int num2 = Integer.parseInt(c.readLine());
	    System.out.println("Divider :" + (num1/num2));
	    
	}

}
