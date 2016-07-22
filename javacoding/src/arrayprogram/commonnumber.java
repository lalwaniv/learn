package arrayprogram;

public class commonnumber {
	public static void main(String[] args) {
	
		int[] arr1 = {7,14,65,99,9,24};
		int[] arr2 = {60,87,94,24,35,80};
		for(int i=0;i<arr1.length;i++){
			for(int j = 0 ; j<arr2.length ; j++){
				if(arr1[i]==arr2[j]){
					System.out.println(" The common number is  : "+ arr1[i]);
					
				}
				
			}
		}
		
	

}
}
