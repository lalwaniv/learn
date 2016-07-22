package FileHandling;

import java.util.Scanner;

public class ReplaceString {
	public static void main(String[] args) {
		String text = "How to check for a word in a file and count the "+
					  "number of times the word occurs in the file " +
				      "and print the total count of the word ";
		String finaltext = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to check for occurance :");
		String wordcheck = scanner.nextLine();
		System.out.println("Enter the word to replace : ");
		String wordreplace = scanner.nextLine();
		Scanner s = new Scanner(text);
		while(s.hasNext()){
			String currentWord = s.next();
			if (currentWord.equalsIgnoreCase(wordcheck))
				
				finaltext = finaltext + " " + wordreplace; 
			else 
				finaltext = finaltext + " " + currentWord;
		}
		System.out.println("Replaced text  : \n" + finaltext );
	}

}



