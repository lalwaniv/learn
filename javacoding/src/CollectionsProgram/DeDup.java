package CollectionsProgram;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class DeDup {
	
	public static void main(String[] args) {
	
		
	ArrayList<Integer> a = new ArrayList<Integer>();

	DeDup m = new DeDup();
	
	a = m.addElement(a, 7);
	a = m.addElement(a, 14);
	a = m.addElement(a, 8);
	a = m.addElement(a, 24);
	a = m.addElement(a, 66);
	a = m.addElement(a, 14);
	m.removeDuplicate(a);
	}
	
	public ArrayList<Integer> addElement(ArrayList<Integer> inputArrayList, int i) {
		inputArrayList.add(i);
		return inputArrayList;
	}
	
	public void removeDuplicate(ArrayList<Integer> inputArrayList){
		HashSet s =  new HashSet<Integer> ();
		ArrayList<Integer>  arr = new ArrayList<Integer>();
		for(int i : inputArrayList){ 		
			if(!s.contains(i)) {
				s.add(i);
				arr.add(i);
			}
		}
		System.out.print(arr + "  ");
	}
}


