package com.ajay.thread;

public class Thrd extends Thread{
	public void run(){
		System.out.println("running thread");
		System.out.println(Thread.currentThread().getName());
	}
	
	public static void main(String []arg){
		Thread t1 = new Thrd();
		Thread t2 = new Thrd();
		t1.setName("Low Priority thread");
		t2.setName("High Priority thread");
		t1.setPriority(1);
		t2.setPriority(10);
		t1.start();
		t2.start();
	}

}

/*
public class Thrd implements Runnable{
	public void run(){
		System.out.println("running thread");
	}
	
	public static void main(String []arg){
		Thread t1 =new Thread( new Thrd());
		Thread t2 =new Thread( new Thrd());
		t1.start();
		t2.start();
	}
}
*/