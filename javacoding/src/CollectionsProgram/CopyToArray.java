package CollectionsProgram;

import java.util.ArrayList;

public class CopyToArray {
	public static void main(String[] args) {
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.add("first");
		arr1.add("second");
		arr1.add("third");
		arr1.add("done");
		System.out.println("Actual ArrayList : "+arr1);
		String[] strArr = new String[arr1.size()];
		arr1.toArray(strArr);
		System.out.println("Copied to Array : ");
		for(String str:strArr){
			System.out.println(str);
			
		}
		
	}  

}
