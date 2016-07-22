package looping;

import java.util.Scanner;

public class divisible {
public static void main(String args[]){
	System.out.println("Enter an integer number : ");
	Scanner input =  new Scanner(System.in);
	int x = input.nextInt();
	if((x%3==0) && (x%5==0)){
		System.out.println("pingpong");
	}else if(x%3==0){
		System.out.println("ping");
	}else if(x%5==0){
		System.out.println("pong");
	}else{
		System.out.println("The number is not divisible by 3 and 5");
	}
	
}

}
