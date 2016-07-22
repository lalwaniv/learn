package StringPrograms;


import java.util.Scanner;

public class AlterString {
	public static void main(String[] args)  {
		String s;
		String alter="";
		
		Scanner ob=new Scanner(System.in);
		System.out.println(" enter String");
		s=ob.nextLine();
		  
	    String[] words =s.split(" ");
	        
	    for (int i = 0; i < words.length; i++) {
	           alter += words[i]+(i+1) + "  ";
	         }
	     System.out.print(alter);
	            
	    }
	}

