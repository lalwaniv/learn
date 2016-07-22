package StringPrograms;

import java.util.Scanner;

public class ReverseEachWord {
	public static void main(String[] args) {
		
	String original,reverse = "";
	Scanner st = new Scanner(System.in);
	
	System.out.print("Enter a String to reverse each word : ");
	original = st.nextLine();
	String[]  words = original.split(" ");
	st.close();
	for(int i = 0;i<words.length ; i++){
		//reverse ="";
		for(int j=words[i].length()-1 ; j>=0;j--){
			reverse = reverse + words[i].charAt(j);
		}
		reverse = reverse + " ";
	}System.out.print(" The reversed word in each String : " + reverse  );

	} 
	
}
