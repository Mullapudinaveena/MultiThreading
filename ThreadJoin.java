package demo2;

public class ThreadJoin implements Runnable{

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new ThreadJoin());
		Thread t2 = new Thread(new ThreadJoin());
		Thread t3 = new Thread(new ThreadJoin());
		
		t1.setName("thread-one");
		t2.setName("thread-two");
		t3.setName("thread-three");
		
		
		t1.start();

		
		try {
			t1.join(1000);
		} catch (Exception e) {
			System.out.println("exception");
		}
		
		t2.start();
		
		try {
			t2.join(1000);
		} catch (Exception e) {
			System.out.println("exception");
		}
		
		t3.start();
		
		try {
			t3.join(1000);
		} catch (Exception e) {
			System.out.println("exception");
		}
		
		
		t1.run();
		t2.run();
		t3.run();
		
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=3; i++) {
			System.out.println("thread name: " +  Thread.currentThread().getName() + " i: " + i);
		}
		
	}
}
