package com.tnsif.interface1;

public class InDemo implements ChildInterface,InterfaceOne {
	@Override
	public void print() {
		System.out.println("print method");
	}
	@Override
	public void show() {
		System.out.println("show method");
	}
	

}
