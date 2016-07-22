package exceptions;

public class ExceptionDemo {
	public static void main(String[] args) {
		ExceptionDemo ed = new ExceptionDemo();
		try {
			ed.printString(null);
		} catch (Exception e){
			System.out.println("Exception occured: " + e.toString());
		}

		try {
			System.out.println(ed.divide(5,0));
		} catch (Exception e){
			System.out.println("Exception occured: " + e.toString());
		}

	
	}
	
	//Method that throws exception
	public void printString(String s) throws Exception {
		System.out.println(s.toString());
	}
	
	public double divide(int x, int y) throws Exception {
		return x/y;
	}
}
