package FileHandling;

import java.util.Scanner;

public class StringOccuranceCount {
	public static void main(String[] args) {
		String text = "How to check for a word in a file and count the "+
					  "number of times the word occurs in the file " +
				      "and print the total count of the word ";
		Scanner word = new Scanner(System.in);
		System.out.println("Enter the string to check for occurance :");
		String wordcheck = word.nextLine();
		int count = 0;
		Scanner s = new Scanner(text);
		while(s.hasNext()){
			if (s.next().equalsIgnoreCase(wordcheck))
				count++;
		}
		System.out.println("The count of occurance : " + count);
	}

}
