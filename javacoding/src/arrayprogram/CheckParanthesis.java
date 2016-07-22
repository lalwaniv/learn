package arrayprogram;

import java.util.Scanner;

public class CheckParanthesis {
	public static void main(String[] args) {
		System.out.println("Enter paranthesis string :");
		String  str = new Scanner(System.in).nextLine();
		int l = str.length();
		int count = 0;
		for(int i = 0; i < l; i++){
			if(str.charAt(i) == '(')
				count++;
			else if(str.charAt(i) == ')')
				count--;
			if (count < 0){
				System.out.println("The paranthesis are not balanced ");
				break;
			}
		}
		if(count == 0)
			System.out.println("The paranthesis is balanced ");
		else if(count != 0)
			System.out.println("The paranthesis are not balanced ");

		
	}

}
