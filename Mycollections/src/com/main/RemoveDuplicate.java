package com.main;

import java.util.HashSet;

public class RemoveDuplicate {
	public static void main(String[] args) {
		int[] arr = {4,8,2,4,9,5,4};
		HashSet<Integer> hs = new HashSet<Integer>();
		
		for(int i =0 ; i< arr.length ; i++)
			hs.add(arr[i]);
		System.out.println( "After deletion of duplication :" + hs);
		
		
	}

}
