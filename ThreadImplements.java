package demo2;

public class ThreadImplements implements Runnable {

	public static void main(String[] args) {
		System.out.println("Hello, world");
		
		Thread t1 = new Thread(new ThreadImplements());
		Thread t2 = new Thread(new ThreadImplements());
		
		System.out.println("State of t1 : " + t1.getState());
		System.out.println("State of t2 : " + t2.getState());
		
		t1.start(); 
		t2.start();
		
		System.out.println("State of t1 : " + t1.getState());
		System.out.println("State of t2 : " + t2.getState());

		t1.run();
		t2.run();
		
		try {
			t1.join();
		} catch (Exception e) {
			System.out.println("exception");
		}
		System.out.println("State of t1 : " + t1.getState());
		System.out.println("State of t2 : " + t2.getState());
	}

	@Override
	public void run() {
		
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println("exception");
		}
		
		
	}
	
}
