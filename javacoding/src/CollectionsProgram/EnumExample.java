package CollectionsProgram;

public class EnumExample {
	public enum Months{
		Jan,
		Feb,
		Mar,
		Apr,
		May,
		June,
		July,
		Aug,
		Sep,
		Oct,
		Nov,
		Dec
		
	}
	
	public static void main(String[] args) {
		for (Months d : Months.values())
			System.out.println(d);
	}
	
		
}
