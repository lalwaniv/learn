package StringPrograms;

public class StringReplace {
	public static void main(String[] args) {
		String str = " Hello World";
		String str1 = str.replaceAll("Hello", "Good Morning");
		
		System.out.println("The original String : "+str);
		System.out.println("Replaced String : "+ str1);
	}
}


