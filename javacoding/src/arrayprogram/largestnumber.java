package arrayprogram;

public class largestnumber {
	public static void main(String[] args) {
		int[] arr = {24,78,64,9,33,88};
		int temp = arr[0];
		for(int i =1 ;i < 6 ; i++){
			
				if(arr[i]> temp){
					
				temp = arr[i];
					
				}
			}
		System.out.println(" The largest number in a given array is : "+ temp);
		}

}
