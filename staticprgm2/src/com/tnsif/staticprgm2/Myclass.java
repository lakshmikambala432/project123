package com.tnsif.staticprgm2;
//demonstrate static methods and blocks

public class Myclass {
	private int section;//instance variable
	private static int srno;//static variable
	static {
		System.out.println("---staticblock---");
		srno=1000;
	}
   //default constructor
	Myclass(){
		System.out.println("---default constructor---");
		srno++;
		section++;
	}
	//static method
	static void display() {
		//System.out.println("section"+section);
		System.out.println("serialno"+srno);
	}
	@Override
	public String toString() {
		return "Myclass [section=" +section);
		
	}
}
