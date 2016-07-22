package CollectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class MethodOperations {
	
	public static void main(String[] args) {
	
		
	ArrayList<Integer> a = new ArrayList<Integer>();

	MethodOperations m = new MethodOperations();
	
	a = m.addElement(a, 7);
	a = m.addElement(a, 14);
	a = m.addElement(a, 8);
	a = m.addElement(a, 24);
	a = m.addElement(a, 66);
	a = m.addElement(a, 85);
	
	boolean result = m.searchElement(a,44);
	System.out.println("ArrayList Elements: "+a);
	System.out.println("Does element exists: " + result);
	m.iterateprint(a);
	m.reverseprint(a);
	
	
	}
	
	public boolean searchElement(ArrayList<Integer> inputArrayList, int i) {
		return inputArrayList.contains(i);
	}
	
	public ArrayList<Integer> addElement(ArrayList<Integer> inputArrayList, int i) {
		inputArrayList.add(i);
		return inputArrayList;
	}
	public void iterateprint(ArrayList<Integer> inputArrayList){
		Iterator it = inputArrayList.iterator();
		System.out.println("List values using iterator : ");
		while(it.hasNext()){
			System.out.print(it.next() + "  ");
		}
		System.out.println();
		
		
	}
	public void reverseprint(ArrayList<Integer> inputArrayList){
		ListIterator it = inputArrayList.listIterator(inputArrayList.size());
		System.out.println("Reversed list using list Iterator : ");
		while(it.hasPrevious()){
			System.out.print(it.previous() + "  ");
			
		}
		
		
	}
	

	

	
}

