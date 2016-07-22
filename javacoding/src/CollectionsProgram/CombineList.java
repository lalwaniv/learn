package CollectionsProgram;

import java.util.ArrayList;
import java.util.Iterator;

public class CombineList {
	
	public static void main(String[] args) {
	
		
	ArrayList<Integer> a = new ArrayList<Integer>();
	ArrayList<Integer> b = new ArrayList<Integer>();
	ArrayList<Integer> c = new ArrayList<Integer>();
	

	CombineList m = new CombineList();
	
	a = m.addElement(a, 1);
	a = m.addElement(a, 3);
	a = m.addElement(a, 5);
	b = m.addElement(b, 2);
	b = m.addElement(b, 4);
	b = m.addElement(b, 6);
	c = m.iterateAdd(a, b);
	
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	System.out.println("c: " + c);
	}
	
	public ArrayList<Integer> addElement(ArrayList<Integer> inputArrayList, int i) {
		inputArrayList.add(i);
		return inputArrayList;
	}
	public ArrayList<Integer> iterateAdd(ArrayList<Integer> a , ArrayList<Integer> b ){
		Iterator it1 = a.iterator();
		Iterator it2 = b.iterator();
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		while(it1.hasNext() && it2.hasNext()){
			ab.add((Integer) it1.next());
			ab.add((Integer) it2.next());
		}
		return ab;
			
	}

}
