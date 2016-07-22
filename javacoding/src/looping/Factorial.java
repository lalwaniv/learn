package looping;
import java.util.Scanner;



public class Factorial
{  

    int fact(int n)
    {
        int result;

       if(n==1)
         return 1;

       result = fact(n-1) * n;
       return result;
    }
    int factloop(int n){
    	int r=1;
    	for(int i=1; i<=n;i++){
    		r = r*i;
    		
    	}
    	return r;
		
    }
     public static void main(String args[])
     {
       Factorial obj_one = new Factorial();
       Scanner num = new Scanner(System.in); 
       System.out.println("Enter the number for Factorial :");
       int x = num.nextInt();
       int a = obj_one.fact(x);
       System.out.println("The factorial of the number is : " + a);
      int  f= obj_one.factloop(x);
       System.out.println("The factorial of given number  without Recursion :"+ f);
     }
}