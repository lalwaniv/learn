package com.main;

import java.util.ArrayList;
import java.util.Iterator;

public class ListOfList {
	static ArrayList<ArrayList<String>> ll = new ArrayList<ArrayList<String>>();
	static ArrayList<String> l1 = new ArrayList<String>();
	static ArrayList<String> l2 = new ArrayList<String>();
	
	
	public static void main(String[] args) {
		ListOfList l = new ListOfList();
		l1.add("a");
		l1.add("b");
		l1.add("c");
		l2.add("m");
		l2.add("n");
		ll.add(l1);
		ll.add(l2);
		System.out.print("list one : " + l1);
		System.out.println();
		System.out.print("List second : " + l2);
		System.out.println();
		Iterator it = ll.iterator();
		while(it.hasNext()){
			ArrayList<String> innerList = new ArrayList<String>();
			innerList = (ArrayList<String>) it.next();
			Iterator inner = innerList.iterator();
			while(inner.hasNext())
				System.out.println(inner.next());
		}
		
	}

}
