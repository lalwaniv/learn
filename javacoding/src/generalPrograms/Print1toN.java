package generalPrograms;

public class Print1toN {
	public void print(int m, int n) {
		if(m <= n) {
				System.out.print(m++ + "   " );
				print(m, n);
		}
	}
	
	public static void main(String[] args) {
		int n = 10;
		Print1toN c = new Print1toN();
		c.print(1, n);
		
	}
}
