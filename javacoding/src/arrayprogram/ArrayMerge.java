package arrayprogram;

public class ArrayMerge {
	public static void main(String[] args) {
		int[] a = {1,3,6};
		int[] b = {2,4,8};
		int[] answer = new int[a.length + b.length];
		int i=0,j=0,k=0;
		while(i< a.length && j< b.length){
			if(a[i]< b[j])
				answer[k++]= a[i++];
			else
				answer[k++] = b[j++];
			
		}
		while (i < a.length)  
	        answer[k++] = a[i++];


	    while (j < b.length)    
	        answer[k++] = b[j++];

		
	System.out.print("The merged array will be : ");
	for(int p = 0 ;p< answer.length ;p++)
		System.out.print("  " +answer[p]);
		}

}
