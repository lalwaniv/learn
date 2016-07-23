package generalPrograms;

public class ImmutableClassDemo {
	   public static void main(String[] args) {
		    int i = 1;
	        
		    ImmutableClass immutableClass = new ImmutableClass(i);
	        
		    System.out.println("Before mutating array: " + immutableClass.getId());
	        
		    i = 2;
	        
		    System.out.println("After mutating array: " + immutableClass.getId());
	   }
}