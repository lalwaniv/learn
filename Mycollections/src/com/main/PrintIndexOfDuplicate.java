package com.main;

import java.util.ArrayList;

public class PrintIndexOfDuplicate {
	public static void main(String[] args) {
		
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(5);
	arr.add(3);
	arr.add(4);
	arr.add(5);
	arr.add(8);
	arr.add(2);
	arr.add(3);
	arr.add(5);
	System.out.println("The elements are           :" + arr);
	
	for(int i = 0 ; i<arr.size() ; i++){
		for(int j = i+1 ; j<arr.size() ; j++){
			if(arr.get(i)==arr.get(j)){
				arr.remove(j);
				System.out.println("The index is " + j);
			
			}		
		}

	
	}
	System.out.println("List after removing duplicates : " + arr);
} 
	
	
}