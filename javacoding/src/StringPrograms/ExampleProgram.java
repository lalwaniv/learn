package StringPrograms;

public class ExampleProgram {
	public static void main(String[] args) {
		int in = 5;
		for(int i = 1;i<=in ;i++){
			   for(int a=in;a > in+1-i && i!=1;a--){
	                System.out.print(a);
	            }
	            for(int j=in;j>=i;j--){
	                System.out.print(in+1-i);
	            }
	            System.out.println();
	        }
		}
			
		

}
