package CollectionsProgram;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import javax.swing.text.html.HTMLDocument.Iterator;

public class HashMapCreation {
	public static void main(String[] args) {
		//int key = Integer.parseInt(args[0]);
		HashMapCreation cr = new HashMapCreation();
		HashMap<Integer , String> hp = new HashMap<Integer , String>();
		hp = cr.createMap(hp, 34,"Rahul");
		hp = cr.createMap(hp, 22,"John");
		hp = cr.createMap(hp, 86,"Sam");
		hp = cr.createMap(hp, 65,"Nancy");
		hp = cr.createMap(hp, 66,"April");
		//cr.removeKey(hp, 22);
		String srr = cr.getValue(hp, 34);
		System.out.println("The value for key  34 is: " + srr);
		// Display content
		for(int key : hp.keySet())
			System.out.println("key and Value : " + key +"   " + hp.get(key));
	}
	public HashMap<Integer,String> createMap(HashMap<Integer,String> hm, int key, String value){
		hm.put(key,  value);
		return hm;
	
	}
	
	public void removeKey(HashMap<Integer,String> hm , int key){
		hm.remove(key);
		
		
	}
	public String getValue(HashMap<Integer,String> hm , int key){
		String sr = "";
		if(hm.containsKey(key))
			sr =  hm.get(key);
		return sr;
	}
}
