package generalPrograms;

public class MiscOOPS {
	int id;
	String name;
	static int noOfTimes;
	

	
	public MiscOOPS(){
		System.out.println("Inside constructor 1, no values initialized\n");
	}
	
	public MiscOOPS(int i, String n){
		System.out.println("Inside constructor 2, printing id and name");
		this.id = i;
		this.name = n;
		System.out.println("id:\t" + this.id + "\nName:\t" + this.name + "\n");
	}
	
	public static void staticMethod() {
		System.out.println("I have been called so many time. I am called from static method and I increment static variable: " + noOfTimes++);
	}
	
	public static void main(String[] args) {
		MiscOOPS m1 = new MiscOOPS();
		MiscOOPS m2 = new MiscOOPS(1, "SomeName");
		m1.staticMethod();
		m2.staticMethod();
		MiscOOPS.staticMethod();
	}
	
	
	static {
		noOfTimes = 0;
		System.out.println("I am in the staic block, always executed first and only one time\n");
	}
}
