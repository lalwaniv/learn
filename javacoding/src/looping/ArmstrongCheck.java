package looping;
import java.util.Scanner;
class ArmstrongCheck
{
   public static void main(String args[])
   {
	   int n, sum = 0, temp , remindar , digits = 0;
	   Scanner in = new Scanner(System.in);
	   System.out.println("Enter a number to check if its  Armstrong number");
	   n = in.nextInt();
	   temp = n;
	   // to count number of digits
	   while(temp !=0){
		   digits++;
		   temp = temp/10;
	   }
	   temp = n;
	   while(temp !=0){
		   remindar = temp%10;
		   sum = sum + power(remindar,digits);
		   temp = temp/10;
	   }
	   if (n==sum)
		   System.out.println(n+"  is a Armstrong number");
	   else
		   System.out.println(n +"  is not a Armstrong number");
	   
}
   	static int power(int n , int r){
   		int c , p = 1;
   		for(c=1;c <= r; c++ )
   			p = p*n;
   		return p;
   	}
   }