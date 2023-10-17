package com.tnsif.threads;

public class ImplementThread extends Runnable{
	
	@Override
	public void run() {
		System.out.println("Runnable Interface");
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImplementThread ob=new ImplementThread();
		Thread t = new Thread(ob);
		t.start();
		t.run();
	}

}
