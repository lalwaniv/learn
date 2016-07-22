package StringPrograms;

import java.util.Scanner;

public class IsItPalindrome {
	

	public static void main(String[] args) {
		String word = "";
	
	Scanner str = new Scanner(System.in);
	System.out.print("Enter the string : ");
	word= str.nextLine();
	
	boolean result = new IsItPalindrome().isPalindrome(word.toCharArray());
	System.out.println(result);
	}
	
	public static boolean isPalindrome(char[] input){
		int i =0;
		int j = input.length-1;
		while(i<j){
			if(input[i++] != input[j--])
				return false;
			
		}
		return true;
	}
}
