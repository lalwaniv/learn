package arrayprogram;

public class SwapNumber {
	public static void main(String[] args) {
		int temp = 0;
		int[] arr = {1,4,3,5,6};
		
		int l = arr.length;
		for(int i=0;i<l-1;i++){
		   
			   if(arr[i]>arr[i+1]){
				 temp = arr[i];
				 arr[i] = arr[i+1];
				 arr[i+1]= temp;
			   }
		   }
				
			
		System.out.print(" Swapped array : ");
		for(int i = 0 ; i< l ; i++)
		System.out.print("  " +arr[i]);
		}
		
	
}
