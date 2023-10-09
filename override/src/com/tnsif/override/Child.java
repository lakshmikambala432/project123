package com.tnsif.override;

public class Child extends Parent{
	private void m1()
	{
		System.out.println("from child m1()");
	}
    @overriding method
    public void m2() {
    	System.out.println("from child m2()");
    }
}
