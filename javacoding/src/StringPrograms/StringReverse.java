package StringPrograms;

import java.util.Scanner;

public class StringReverse {
	
	public static void main(String[] args) {
		String original , reverse ="";
		Scanner word = new Scanner(System.in);
		System.out.println("Enter a String to Reverse : ");
		original = word.nextLine();
		
		word.close();
		int l = original.length();
		for(int i= l-1; i>=0 ; i--){
			reverse = reverse + original.charAt(i);
		}
		System.out.println(" The Reversed String  : "+ reverse);
		
		System.out.println(" Hashcode  : "+ reverse.hashCode());
		System.out.println(" equals  : "+ reverse.equals("Hi"));

}
}