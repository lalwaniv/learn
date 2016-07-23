package generalPrograms;

public class GarbageCollection {
	public static void main(String[] args) {
		GarbageCollection x = new GarbageCollection();
		x = null;
		System.gc();
	}
}