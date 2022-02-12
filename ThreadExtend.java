package demo2;

public class ThreadExtend extends Thread{
	
//	1. Thread creation using 2 approaches. 1 example on each. 
//	1. extending the thread class
//	2. implementing the Runnable interface
	
	public static void main(String[] args) {
		System.out.println("Hello, world");
		
		ThreadExtend t1 = new ThreadExtend();
		ThreadExtend t2 = new ThreadExtend();
		t1.setName("Thread-one");
		System.out.println("State of t1: " + t1.getState());
		t1.start();
		System.out.println("State of t1: " + t1.getState());
		t1.run();
		
		
		
		t2.setName("Thread-two");
		System.out.println("State of t2: " + t2.getState());
		t2.start();
		System.out.println("State of t2: " + t2.getState());
		t2.run();
		
		
		System.out.println("State of t1: " + t1.getState());
		System.out.println("State of t2: " + t2.getState());
	}
	
	
	public void run() {
		try {
			Thread.sleep(2000);
		} catch(Exception e) {
			System.out.println("exception");
		}
//		System.out.println("name of thread: " + Thread.currentThread().getName());
		System.out.println("State of " + Thread.currentThread().getName() + ": " + Thread.currentThread().getState());

	}
	
}