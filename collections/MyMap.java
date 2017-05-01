package com.ajay.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MyMap {
	public static void main(String []arg){
		Map<Integer, String> obj = new HashMap<Integer, String>();
		obj.put(1,"mumbai");
		obj.put(2,"bangalore");
		obj.put(3,"delhi");
		obj.put(4,"chandigarh");
		obj.put(5,"punjab");
		
		
		Set<Map.Entry<Integer, String>> set = obj.entrySet();
		Iterator<Map.Entry<Integer, String>> iterator = set.iterator();
		while(iterator.hasNext()){
			Map.Entry<Integer, String> entry = iterator.next();
			System.out.println("key = "+ entry.getKey());
			System.out.println("value ="+ entry.getValue());
		}
		
	}

}
