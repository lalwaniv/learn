package exceptions;

public class NullPointer {
	
	
	public static void main(String[] args) {
		String s = null;
		try {
			s.toString();
		} catch (NullPointerException t){
			System.out.println("null pointer exception");
		}
	}

}
