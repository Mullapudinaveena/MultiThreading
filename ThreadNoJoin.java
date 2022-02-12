package demo2;

public class ThreadNoJoin implements Runnable{
	public static void main(String[] args) {
		Thread t1 = new Thread(new ThreadNoJoin());
		Thread t2 = new Thread(new ThreadNoJoin());
		Thread t3 = new Thread(new ThreadNoJoin());
		
		t1.setName("thread-one");
		t2.setName("thread-two");
		t3.setName("thread-three");
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.run();
		t2.run();
		t3.run();
		
	}
	
	@Override
	public void run() {
		for(int i=1; i<=3; i++) {
			System.out.println("thread name: " +  Thread.currentThread().getName() + " i: " + i);
		}
		
	}

}
