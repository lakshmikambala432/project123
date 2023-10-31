package com.tnsif.set;

import java.util.TreeSet;

//program to demonstrate treeSet operation
public class TreeSetProgm {

	public static void treeSetOperations() {
		
		TreeSet<Integer>num_treeset=new TreeSet<>();
		num_treeset.add(76);
		num_treeset.add(56);
		num_treeset.add(156);
		num_treeset.add(16);
		//num_treeset.add(null);//exception arises
		//call iterator
		Iterator<Integer>iterator=num_treeset.iterator();
		System.out.println("elements of iterator are");
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
		
		
		

	}

}
