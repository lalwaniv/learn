package generalPrograms;

public class AccessModifiers {
	private void msg1(){
		System.out.println("This is a Private access Modifier and accessed only within the class");
	}
	
	public void msg2(){
		System.out.println("This is a Public access modifier and can be accessed outside the package ");
	}
	void msg3(){
		System.out.println("This is a default access modifier and can be accessed only within the package");
	}
	protected void msg4(){
		System.out.println("This is a protected access modifier and can be accessed within the package ");
	}
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		am.msg1();
		
	}
}
