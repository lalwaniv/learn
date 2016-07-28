package com.main;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CreateDictionary {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String,String>();
	
	/*take -> carry or bring with one
	jump -> move suddenly and quickly in a specified way
	walk -> an act of traveling or an excursion on foot
	run -> an act or spell of running
	dance -> move in a quick and lively way
	help -> serve someone with
	run -> an act or spell of running */
	
	map.put("take", "carry or bring with one");
	map.put("jump", "move suddenly and quickly in a specified way");
	map.put("walk","an act of traveling or an excursion on foot");
	map.put("run", "an act or spell of running");
	map.put("dance", "move in a quick and lively way");
	map.put("help","serve someone with");
	map.put("run", "an act or spell of running");
	String key = "walk";
	String meaning = "move";
	if(map.containsKey(key))
		map.replace(key,meaning);
	else
		map.put(key,meaning);
	
	Iterator<String> it = map.keySet().iterator();
	
	while(it.hasNext()){
		String key1 =it.next();
		System.out.println("key: " + key1 + "    value: " + map.get(key1));
		}

	}
}