package com.tnsif.arraylist;
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<>();
		System.out.println("check the list"+list1.isEmpty());
		list1.add(2);
		//list1.add('w');
		list1.add(3);
		System.out.println("the size of the list"+list1.size());
		System.out.println("the list elements are"+list1);
		System.out.println("the elements is present or not"+list1.contains(55));
		//remove an element by its index
		System.out.println("remove an element"+list1.remove(1));
		//to get the element at a particular position
		System.out.println("element at the position"+"  "+list1.get(0));
		list1.add(4);
		list1.add(7);
		//traverse a list
		list1.add(4);
		list1.add(5);
		System.out.println("the list elements are"+list1);
		
		
		  Iterator<E> <Integer>i=list1.iterator();
		  while(i.hasNext()) {
			  Integer p=i.next();
			  System.out.println(p);
		  }
		

	}

}
