package generalPrograms;

public final class ImmutableClass {
	private final int id;

	public ImmutableClass(int n){
        this.id = n;
    }
    
    public int getId(){
    	return this.id;
    }
}