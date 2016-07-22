package OOPSMethod;

public class InheritanceDemo extends baseClass{
	@Override
	public void overridedMethod(){
		super.overridedMethod();
		System.out.println("I am a overrided method from child class");
	}
	
	public void personalDetail(String Name) {
		System.out.println("personalDetail method called with Name parameters: " + Name);
	}
	
	public void personalDetail(String Name, int Age) {
		System.out.println("personalDetail method called with Name and Age parameters: " + Name + " age " + Age);
	}
	
	
	public static void main(String[] args) {
		System.out.println("Override Demo");
		baseClass bc = new InheritanceDemo();
		bc.overridedMethod();
		
		System.out.println("\nOverload Demo");
		InheritanceDemo o = new InheritanceDemo();
		o.personalDetail("Vaijayanthi Lalwani");
		o.personalDetail("Vaijayanthi Lalwani", 55);
	}

}